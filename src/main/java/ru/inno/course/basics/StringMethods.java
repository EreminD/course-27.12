package ru.inno.course.basics;

public class StringMethods {

    public static void main(String[] args) {

        String email = "mail@mail.ru ";
        String result = email.trim();
        System.out.println(email + email.length());
        System.out.println(result + result.length());

        int index = email.indexOf("m");
        System.out.println(index);

        String newEmail = "Mail@mail.ru";
        System.out.println(newEmail.toLowerCase());

        String url = "https://ya.ru/";
        System.out.println( url.startsWith("https") );

        String a = "a";
        System.out.println(a.equals("a"));
        System.out.println(a.equals("A"));

        System.out.println(email.replace("@", "###"));
        System.out.println(email);

        // удаление пробелов
        String cardNumber = "1234 5678 9012 3456";
        System.out.println(cardNumber.replace(" ", ""));


    }
}
