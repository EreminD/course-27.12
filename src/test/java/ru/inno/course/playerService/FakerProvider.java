package ru.inno.course.playerService;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class FakerProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) throws Exception {

        Faker faker = new Faker(new Locale("ru"));
        List<Arguments> arguments = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arguments.add(
                    Arguments.of(
                            faker.name().firstName(),
                            faker.number().numberBetween(Integer.MIN_VALUE, 0)
                    ));
        }

        // список привели к стриму
        return arguments.stream();
    }
}
