package ru.inno.course.playerService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.inno.course.patterns.ApiResponse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class MightBeEmptyTests {
    private PlayerService service;
    private final Path dataFile = Path.of("./data.json");

    @BeforeEach
    public void setUp() throws IOException {
        Files.deleteIfExists(dataFile);
        service = new PlayerServiceImpl();
    }

    @Test
    public void successfulCreation() {
        Optional<Integer> idContainer = service.createPlayer("Tester");
        if (idContainer.isPresent()) {
            int id = idContainer.get();
            assertEquals(1, id);
        }
    }

    @Test
    public void createDuplicate() {
        Optional<Integer> idContainer1 = service.createPlayer("Tester"); // 1
        Optional<Integer> idContainer2 = service.createPlayer("Tester"); // ERROR!

        assertTrue(idContainer1.isPresent());
        assertTrue(idContainer2.isEmpty());
    }

    @Test
    public void deletePlayer(){
        service.createPlayer("Tester");

        Optional<Player> playerMightBeEmpty = service.deletePlayer(99);
        if(playerMightBeEmpty.isPresent()){
            assertEquals("Tester", playerMightBeEmpty.get().getNick());
        } else {
            System.out.println("Произошла ошибка");
        }
    }

}
