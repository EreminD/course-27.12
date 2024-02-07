package ru.inno.course.basics.fs;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class PlaygroundXML {

    public static void main(String[] args) throws JAXBException {

        Path filePath = Path.of("src/main/resources/library/books.xml");
        Path filePath1 = Path.of("src/main/resources/library/books1.xml");

        List<Author> authors = new ArrayList<>();
        authors.add(new Author("Илья", "Ильф"));
        authors.add(new Author("Евгений", "Петров"));

        Book book = new Book("12 стульев", "1234-3252343-2135", 199);
        book.setAuthor(authors);

        JAXBContext context = JAXBContext.newInstance(Book.class, Author.class);

        // Obj -> XML
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(book, filePath.toFile());

        // XML -> Obj
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Book b = (Book) unmarshaller.unmarshal(filePath1.toFile());

    }
}
