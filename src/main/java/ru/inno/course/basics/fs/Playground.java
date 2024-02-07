package ru.inno.course.basics.fs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Playground {

    public static void main(String[] args) throws IOException {

        Path filePath = Path.of("src/main/resources/counter.txt");

        if (Files.exists(filePath)) {
            // 1. прочитать контент
            String counterAsAString = Files.readString(filePath);
            // 2. Привести к числу
            int counter = 0;
            try {
                counter = Integer.parseInt(counterAsAString);
            } catch (Exception ex){
                counter = 0;
            }
            // 3. увеличить на 1
            counter += 1;

            // 4. записать обатно в файл
            Files.writeString(filePath, Integer.toString(counter), StandardOpenOption.WRITE);
        } else {
            Files.writeString(filePath, "1");
        }
    }
}
