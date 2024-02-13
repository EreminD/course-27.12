package ru.inno.course.playerService;

import java.io.IOException;
import java.util.Collection;

public interface DataProvider {

    void save(Collection<Player> players) throws IOException;

    Collection<Player> load() throws IOException;
}