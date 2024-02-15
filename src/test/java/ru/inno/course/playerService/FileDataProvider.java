package ru.inno.course.playerService;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FileDataProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        List<String> content = Files.readAllLines(Path.of("src/test/resources/testData.txt"));

        List<Arguments> arguments = new ArrayList<>();

        for (String row : content) {
            String[] data = row.split(",");
            arguments.add(Arguments.of(data[0], Integer.parseInt(data[1])));
        }

        // список привели к стриму
        return arguments.stream();
    }
}
