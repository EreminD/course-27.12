package ru.inno.course.playerService;

import java.util.Collection;
import java.util.Optional;

public interface PlayerService {
    // получить игрока по id
    Player getPlayerById(int id);

    // получить список игроков
    Collection<Player> getPlayers();

    // создать игрока (возвращает id нового игрока)
    Optional<Integer> createPlayer(String nickname);

    // удалить игрока по id'шнику, вернет удаленного игрока
    Optional<Player> deletePlayer(int id);

    // Добавить очков игроку. Возвращает обновленный счет
    int addPoints(int playerId, int points);
}