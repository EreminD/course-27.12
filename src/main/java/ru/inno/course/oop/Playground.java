package ru.inno.course.oop;

public class Playground {

    public static void main(String[] args) {

        // тип_данных имя_переменной = значение


//        User userIvan = new User("Иван", "ivan@mail.ru", 14); // <----
//        System.out.println(userIvan.name);
//        System.out.println(userIvan.email);
//        System.out.println(userIvan.age);
//        System.out.println(userIvan.nickname);
//        System.out.println(userIvan.rating);
//
//        User userElena = new User("Елена", "elena@mail.ru", 18);
//        userElena.rating = 123;
//        userElena.isOnline = false;
//        userElena.rating = 456;
//        System.out.println(userElena.name);
//        System.out.println(userElena.email);
//        System.out.println(userElena.age);
//        System.out.println(userElena.nickname);
//        System.out.println(userElena.rating);

        Passport ivan = new Passport("0111", "123456", "Иван", "Крылов", "Андреевич");
        System.out.println(ivan.firstName + " " + ivan.middleName + " " + ivan.lastName);

        Passport john = new Passport("0123", "456321", "Джон", "Траволта");
        System.out.println(john.firstName + " " + john.middleName + " " + john.lastName);

        Issuer moscowMvd = new Issuer("МВД г.Москва", 220110);
        Passport andreyPassport = new Passport("Андрей", "Петров", moscowMvd);

        System.out.println( andreyPassport.kem_vidan_passport.title );



    }
}
