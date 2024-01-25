package ru.inno.course.basics;

import ru.inno.course.array.Car;

public class Conditions {

    public static void main(String[] args) {

        System.out.println("Start");

        int balance = 20; // get from DB
        int amount = 34; // calculate

        if ( balance > amount ){ // -> true
            System.out.println("Можно купить");
        } else { // -> false
            System.out.println("Недостаточно средств");
        }

        System.out.println("Finish");

        // Сравнение чисел
        // > >= < <= == !=

        String url = "https://ya.ru";
        if ( url.startsWith("https") ) {
            System.out.println("Соединение безопасно");
        }


    }
}
