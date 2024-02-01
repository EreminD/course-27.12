package ru.inno.course.oop.dataclass;

public class Playground {

    public static void main(String[] args) {

//        int x = 10;
//        int y = 11;
//        System.out.println(x == y);
//        System.out.println(y == x);

        // step 1; Get from DB
        Book bookDb = new Book("12 стульев", "1234-12345422-13423", "", 199);

        // step 2; Get from XML
        Book bookXml = new Book("12 стульев", "1234-12345422-13423", "",199);

        // step 3; Check books are equal;

        // сравнение ссылок
        System.out.println(bookDb == bookXml);

        System.out.println( bookDb.equals(bookXml) );

        System.out.println(bookXml.hashCode());
        System.out.println(bookDb.hashCode());

        System.out.println(bookDb.hashCode() == bookXml.hashCode());

        // коллизия
        Point p1 = new Point(1,4);
        Point p2 = new Point(4,1);

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode() == p2.hashCode());

        System.out.println(bookDb);
        System.out.println(bookXml);
    }
}
