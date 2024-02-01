package ru.inno.course.oop.collections;

import ru.inno.course.oop.dataclass.Book;


import java.util.*;


public class Playground {

    public static void main(String[] args) {


//        LIST

        List<Book> books = new ArrayList<>();
        // List<Book> books = new LinkedList<>();

        System.out.println(books.size());
        books.add(new Book("12 стульев", "1234-12345422-13423", "", 199));
        books.add(new Book("12 стульев", "1234-12345422-13423", "", 199));
        books.add(new Book("12 стульев", "1234-12345422-13423", "", 199));
        books.add(new Book("12 стульев", "1234-12345422-13423", "", 199));

        System.out.println(books.size());
        System.out.println(books.get(1));

        books.remove(0);
        books.clear();


        // ??
//        List<Book> shouldBeUnique = new ArrayList<>();

        Map<String, Book> authorsToBooks = new HashMap<>();

        authorsToBooks.put("Пелевин", new Book("Поколение П", "вапавыкепр", "Пелевин", 2000));
        authorsToBooks.put("Пушкин", new Book("Капитанская дочка", "1231241254", "Пушкин", 3000));
        authorsToBooks.put("Ильф", new Book("12 стульев", "1231241254", "И и П", 3000));
        authorsToBooks.put("Петров", new Book("12 стульев", "1231241254", "И и П", 3000));


        System.out.println( authorsToBooks.get("Пушкин") );
        System.out.println( authorsToBooks.get("Тютчев") );


        authorsToBooks.put("Пушкин", new Book("Стихи", "1212312331241254", "Пушкин", 3000));


        Set<Book> shouldBeUnique = new HashSet<>();
        shouldBeUnique.add(new Book("12 стульев", "1231241254", "И и П", 3000));
        shouldBeUnique.add(new Book("12 стульев", "1231241254", "И и П", 3000));
        shouldBeUnique.add(new Book("12 стульев", "1231241254", "И и П", 3000));
        shouldBeUnique.add(new Book("12 стульев", "1231241254", "И и П", 3000));
        shouldBeUnique.add(new Book("12 стульев", "1231241254", "И и П", 3000));
        shouldBeUnique.add(new Book("12 стульев", "1231241254", "И и П", 3000));
        shouldBeUnique.add(new Book("Поколение П", "вапавыкепр", "Пелевин", 2000));

    }
}
