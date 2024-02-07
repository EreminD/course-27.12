package ru.inno.course.basics.fs.hw;

import java.util.Collection;

public class TestClass {

    public static void main(String[] args) {
        PlayerService service = null;

        int playerId = service.createPlayer("WinMaster_777");
        service.addPoints(playerId, 100);

        Collection<Player> players = service.getPlayers();
        for (Player player : players) {
            System.out.println(player);
        }

    }
}