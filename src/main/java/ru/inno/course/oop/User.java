package ru.inno.course.oop;

public class User {

    // свойства (properties)
    String name;
    String nickname;
    String email;
    int age;
    int rating;
    boolean isOnline = true;

    // конструктор, принимающий 3 аргумента
    public User(String nameToBe, String emailToBe, int ageToBe) {
        name = nameToBe;
        email = emailToBe;
        age = ageToBe;
        nickname = emailToBe;
        rating = 99;
    }

}
