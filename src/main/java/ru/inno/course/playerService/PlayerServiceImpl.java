package ru.inno.course.playerService;

import java.util.*;

public class PlayerServiceImpl implements PlayerService {
    private Map<Integer, Player> players;
    private Set<String> nicknames;
    private int counter = 0;
    private final DataProvider provider;

    public PlayerServiceImpl() {
        provider = new DataProviderJSON();
        initStorages();
    }

    @Override
    public Player getPlayerById(int id) {
        if (!this.players.containsKey(id)) {
            throw new NoSuchElementException("No such user: " + id);
        }

        return this.players.get(id);
    }

    @Override
    public Collection<Player> getPlayers() {
        return this.players.values();
    }

    @Override
    public Optional<Integer> createPlayer(String nickname) {
        if (nicknames.contains(nickname)) {
//            throw new IllegalArgumentException("Nickname is already in use: "+ nickname);
            return Optional.empty();
        }

        counter++;
        Player player = new Player(counter, nickname, 0, true);
        this.players.put(player.getId(), player);
        this.nicknames.add(nickname);
        saveToFile();
        return Optional.of(player.getId());
    }

    @Override
    public Optional<Player> deletePlayer(int id) {
        if (!this.players.containsKey(id)) {
//            throw new NoSuchElementException("No such user: " + id);
            return Optional.empty();
        }

        Player p = this.players.remove(id);
        saveToFile();
        nicknames.remove(p.getNick());
        return Optional.of(p);
    }

    @Override
    public int addPoints(int playerId, int points) {
        if (!this.players.containsKey(playerId)) {
            throw new NoSuchElementException("No such user: " + playerId);
        }

        if (points < 1) {
            throw new IllegalArgumentException("Количество очков должно быть больше нуля" + points);
        }
        Player player = this.players.get(playerId);
        int currentPoints = player.getPoints();
        int newPoints = currentPoints + points;
        player.setPoints(newPoints);
        saveToFile();
        return player.getPoints();
    }

    private void initStorages() {
        Collection<Player> currentList = Collections.EMPTY_LIST;
        try {
            currentList = provider.load();
        } catch (Exception ex) {
            System.err.println("File loading error. " + ex);
        }

        players = new HashMap<>();
        nicknames = new HashSet<>();

        for (Player player : currentList) {
            players.put(player.getId(), player);
            nicknames.add(player.getNick());
            if (player.getId() > counter) {
                counter = player.getId();
            }
        }
    }

    private void saveToFile() {
        try {
            this.provider.save(players.values());
        } catch (Exception ex) {
            System.err.println("File saving error");
        }
    }

}