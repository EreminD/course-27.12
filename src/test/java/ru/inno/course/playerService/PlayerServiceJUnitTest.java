package ru.inno.course.playerService;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerServiceJUnitTest {

    private ObjectMapper mapper = new ObjectMapper();
    private Path dataFile = Path.of("./data.json");
    private PlayerService service;

    @BeforeEach
    public void setUp() throws IOException {
        Files.deleteIfExists(dataFile);
        service = new PlayerServiceImpl();
    }

    @AfterEach
    public void tearDown() throws IOException {
        Files.deleteIfExists(dataFile);
    }

    @Test
    @Tags({@Tag("добавление"), @Tag("чистаяСистема")})
    @DisplayName("Создать первого игрока (файла не существует)")
    public void newPlayerCreation() throws IOException {
        // 2. Создать игрока
        int alexId = service.createPlayer("Alex");
        // 3. Прочитать содержимое файла
        List<Player> playersFromFile = mapper.readValue(dataFile.toFile(), new TypeReference<List<Player>>() {
        });
        // 4. Проверить, что в файле есть наш игрок
        Player playerToBe = service.getPlayerById(alexId);
        Player playerAsIs = playersFromFile.get(0);

        assertEquals(playerToBe, playerAsIs);
        assertEquals(playersFromFile.size(), 3);
    }

    @Test
    @Tag("добавление")
    @DisplayName("Добавить нового игрока в существующую коллекцию")
    public void addPlayerToCollection() throws IOException {
        service.createPlayer("Billy");
        service.createPlayer("Willy");
        service.createPlayer("Dilly");
        // 1. Проверить, что файл есть и он не пустой. -> запомнить, сколько было игроков
        List<Player> listBeforeAdd = mapper.readValue(Path.of("wrong PATH").toFile(), new TypeReference<List<Player>>() {
        });
        Player billy = listBeforeAdd.get(0);

        // 2. Создать нового игрока
        int martaId = service.createPlayer("Marta");

        // 3. Прочитать содержимое фала -> список игроков
        List<Player> listAfterAdd = mapper.readValue(dataFile.toFile(), new TypeReference<List<Player>>() {
        });

        // 4. Проверить, что список стал на 1 больше
        System.out.println(listAfterAdd.size() == listBeforeAdd.size() + 1);
        // 5. Проверить, что в списке ест старый и новый игроки.
        Player marta = service.getPlayerById(martaId);
        assertTrue(listAfterAdd.contains(marta));
        assertTrue(listAfterAdd.contains(billy));
    }

    @Test
    @DisplayName("Удалить игрока из списка")
    public void deletePlayer() throws IOException {
        // 1. Посмотреть список игроков --> сохранить размер
        service.createPlayer("Kenny");

        List<Player> listBeforeDelete = mapper.readValue(dataFile.toFile(), new TypeReference<List<Player>>() {
        });
        // 2. id любого (первого) игрока
        Player willBeDeleted = listBeforeDelete.get(0);
        // 3. Удалить
        Player deleted = service.deletePlayer(willBeDeleted.getId());
        // 4. Проверить, что размер файла стал на 1 меньше
        List<Player> listAfterDelete = mapper.readValue(dataFile.toFile(), new TypeReference<List<Player>>() {
        });

        assertEquals(listBeforeDelete.size() - 1, listAfterDelete.size());

        // 5. Список НЕ содержит нашего игрока
        assertFalse(listAfterDelete.contains(deleted));

    }
}
