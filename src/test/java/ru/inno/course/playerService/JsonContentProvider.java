package ru.inno.course.playerService;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class JsonContentProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        return Stream.of(
                Arguments.of("[{\"id\":1,\"nick\":\"Kenny\",\"points\":0,\"online\":true}]", 1),
                Arguments.of("[{\"id\":1,\"nick\":\"Kenny1\",\"points\":0,\"online\":true}, {\"id\":2,\"nick\":\"Kenny2\",\"points\":0,\"online\":true}]", 2),
                Arguments.of("[]", 0)
        );
    }
}
