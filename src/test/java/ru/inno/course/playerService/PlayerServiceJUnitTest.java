package ru.inno.course.playerService;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerServiceJUnitTest {
    private PlayerService service;
    private final Path dataFile = Path.of("./data.json");

    @BeforeEach
    public void setUp() throws IOException {
        Files.deleteIfExists(dataFile);
        service = new PlayerServiceImpl();
    }

    @ParameterizedTest
    @ValueSource(strings = {"Alex", "Алекс", " ", "alex@mail.ru", "1234lex"})
    @NullAndEmptySource
    @Tags({@Tag("create"), @Tag("positive")})
    @DisplayName("Создать первого игрока (файла не существует)")
    public void newPlayerCreation(String nickname) throws IOException {
        int alexId = service.createPlayer(nickname);
        List<Player> playersFromFile = getPlayersFromStorage();

        Player playerToBe = service.getPlayerById(alexId);
        Player playerAsIs = playersFromFile.get(0);
        assertEquals(playerToBe, playerAsIs);
        assertEquals(playersFromFile.size(), 1);
    }

    @Test
    @Tags({@Tag("create"), @Tag("positive")})
    @DisplayName("Добавить нового игрока в существующую коллекцию")
    public void addPlayerToCollection() throws IOException {
        service.createPlayer("Billy");
        service.createPlayer("Willy");
        service.createPlayer("Dilly");
        List<Player> listBeforeAdd = getPlayersFromStorage();
        Player billy = listBeforeAdd.get(0);

        int martaId = service.createPlayer("Marta");
        List<Player> listAfterAdd = getPlayersFromStorage();

        Player marta = service.getPlayerById(martaId);
        assertEquals(listBeforeAdd.size() + 1, listAfterAdd.size());
        assertTrue(listAfterAdd.contains(marta));
        assertTrue(listAfterAdd.contains(billy));
    }

    @Test
    @DisplayName("Удалить игрока из списка")
    @Tags({@Tag("delete"), @Tag("positive")})
    public void deletePlayer() throws IOException {
        service.createPlayer("Kenny");
        List<Player> listBeforeDelete = getPlayersFromStorage();

        Player willBeDeleted = listBeforeDelete.get(0);
        Player deleted = service.deletePlayer(willBeDeleted.getId());

        List<Player> listAfterDelete = getPlayersFromStorage();
        assertEquals(listBeforeDelete.size() - 1, listAfterDelete.size());
        assertFalse(listAfterDelete.contains(deleted));
    }

    @Test
    @Tags({@Tag("delete"), @Tag("negative")})
    @DisplayName("Удалить игрока из списка (игрока не существует)")
    public void deleteNonExistPlayer() throws IOException {
        service.createPlayer("Kenny");
        int notExistedPlayer = Integer.MAX_VALUE;

        // 1. Посмотреть список игроков --> сохранить размер
        List<Player> listBeforeDelete = getPlayersFromStorage();

        // 3. Удалить несуществующего игрока -> проверить, что выпало исключение
        assertThrows(NoSuchElementException.class, () -> service.deletePlayer(notExistedPlayer));

        // 4. Проверить, что размер файла не изменился
        List<Player> listAfterDelete = getPlayersFromStorage();
        assertEquals(listBeforeDelete, listAfterDelete);
    }

    @Test
    @DisplayName("Накинуть очков игроку - проверить, что состояние пересохранилось")
    @Tags({@Tag("update"), @Tag("positive")})
    public void setPoints() throws IOException {
        int kennyId = service.createPlayer("Kenny");
        int points = 100;
        service.addPoints(kennyId, points);

        // 4. Проверить, что размер файла не изменился
        List<Player> list = getPlayersFromStorage();
        Player kenny = list.get(0);
        assertEquals(points, kenny.getPoints());
    }


    @ParameterizedTest(name = "{index} Значение параметра {0} ->{1}")
    @ArgumentsSource(FakerProvider.class)
    @Tags({@Tag("update"), @Tag("negative")})
    @DisplayName("Негативные тесты на добавление очков")
    public void testPoints(String nick, int point) {
        int kennyId = service.createPlayer(nick);
        assertThrows(IllegalArgumentException.class, () -> service.addPoints(kennyId, point));
    }

    @Test
    @DisplayName("Запросить данные игрока по id")
    @Tags({@Tag("get"), @Tag("positive")})
    public void getPlayerById() throws IOException {
        createStorage("[{\"id\":1,\"nick\":\"Kenny\",\"points\":0,\"online\":true}]");
        service = new PlayerServiceImpl();
        Player kenny = service.getPlayerById(1);
        assertEquals("Kenny", kenny.getNick());
    }

    @ParameterizedTest
    @DisplayName("Загрузка хранилища из файла")
    @ArgumentsSource(JsonContentProvider.class)
    @Tags({@Tag("get"), @Tag("positive")})
    public void getDataFromFile(String fileContent, int expectedSize) throws IOException {
        createStorage(fileContent);
        service = new PlayerServiceImpl();
        assertEquals(expectedSize, service.getPlayers().size());
    }

    @Test
    @DisplayName("Запросить данные игрока по id (игрока не существует)")
    @Tags({@Tag("get"), @Tag("negative")})
    public void getPlayerByIdNotExists() throws IOException {
        createStorage("[{\"id\":1,\"nick\":\"Kenny\",\"points\":0,\"online\":true}]");
        assertThrows(NoSuchElementException.class, () -> service.getPlayerById(2));
    }

    @Test
    @DisplayName("Создание дубликата – не должно быть одинаковых ников")
    @Tags({@Tag("create"), @Tag("negative")})
    public void createDuplicateUser() {
        String nickname = "Kenny";
        service.createPlayer(nickname);
        assertThrows(IllegalArgumentException.class, () -> service.createPlayer(nickname));
        assertEquals(1, service.getPlayers().size());
    }

    @Test
    @Tags({@Tag("create"), @Tag("delete"), @Tag("positive")})
    @DisplayName("Удалить и создать с тем же ником.")
    public void recreateUser() {
        String nickname = "Kenny";
        int kennyId = service.createPlayer(nickname);

        service.deletePlayer(kennyId);
        int newKennyId = service.createPlayer(nickname);

        assertNotEquals(newKennyId, kennyId);
        assertEquals(1, service.getPlayers().size());
    }

    @Test
    @Tags({@Tag("update"), @Tag("negative")})
    @DisplayName("Добавить очков несуществующему игроку")
    public void addPointsToNotExistUser() {
        assertThrows(NoSuchElementException.class, () -> service.addPoints(99, 100));
    }

    // вспомогательные методы
    private List<Player> getPlayersFromStorage() throws IOException {
        return new ObjectMapper().readValue(dataFile.toFile(), new TypeReference<List<Player>>() {
        });
    }

    private void createStorage(String content) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(dataFile.toFile(), mapper.readTree(content));
    }

}
