package ru.inno.course.basics.fs;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PlaygroundJSON {

    public static void main(String[] args) throws IOException {

        // mapping

        // пути до файла
        Path filePath = Path.of("src/main/resources/library/books.json");
        Path filePath1 = Path.of("src/main/resources/library/books1.json");

        List<Author> authors = new ArrayList<>();
        authors.add(new Author("Илья", "Ильф"));
        authors.add(new Author("Евгений", "Петров"));

        Book book = new Book("12 стульев", "1234-3252343-2135", 199);
        book.setAuthor(authors);
        ObjectMapper mapper = new ObjectMapper();

        // записать
        mapper.writeValue(filePath.toFile(), book);

//        // прочитать
//        Book bookFromFile = mapper.readValue(filePath1.toFile(), Book.class);
//        System.out.println(bookFromFile.getPrice());
//        System.out.println("bookFromFile = " + bookFromFile);


        // Работа с json как с деревом
        JsonNode jsonNode = mapper.readTree(filePath1.toFile());
        jsonNode.get("author");
        System.out.println("jsonNode = " + jsonNode);
    }
}

