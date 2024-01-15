package ru.inno.course.basics;

public class Lesson1 {

    public static void main(String[] args) {

        var balance = 1;
        System.out.println(balance);

        balance = 50000;

        var myBalance = -600;

        System.out.println(balance);
        System.out.println(myBalance);


        // ТИПЫ ДАННЫХ
        // 1. что я могу хранить?

        // var balance = 100;
        // тип_данных имя_переменной = значение

        boolean isEmailValid = true; // true|false
        byte peopleInRoom = -128; // -128 -> 127 // 1
        short coins = 32000; // -32 -> 32... // 2
        int wordsCount = 2000000000; // -2 bln -> 2bln // 4  <-----
        long distance = 202020202020202L;  // 8

        int i = 1;

        float fPi = 3.14f;
        double dPi = 3.1415; // <-----

        char letterA = 'a';

        String name = "Дима";
        String sentence = "Я не люблю фасоль.";
        String space = "      ";
        String blank = "";

        System.out.println(sentence);

        String passport = "0112 232323";
        String inn = "123454323454";
        System.out.println(passport);

        // 2. что я могу делать?

        boolean isKnownLogin = false;
        boolean isPasswordValid = false;

        boolean access = isKnownLogin && isPasswordValid ;
        System.out.println(access);

        boolean wierdAccess = isPasswordValid || isKnownLogin;
        System.out.println(wierdAccess);

        boolean isButtonGreen = false;
        System.out.println( !isButtonGreen );

        int a = 10;
        int b = -20;

        int c = 40 - 40;
        System.out.println(a + b);
        // +
        // -
        System.out.println( a * b);
        System.out.println( b / a);
        System.out.println( b / (a + a) );

//        System.out.println( a / c);

        int amount = 1000000;
        System.out.println( balance >= amount );

        System.out.println( balance == amount);

        System.out.println( balance != amount);
    }

}
