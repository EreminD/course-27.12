package ru.inno.course.oop;

public class User {

    // свойства (properties)
    private String name;
    private String phone;
    private String nickname;
    private String email;
    private int age;
    private int rating;
    boolean isOnline = true;

    // конструктор, принимающий 3 аргумента


    public User(String name, String phone, String nickname, String email, int age, int rating, boolean isOnline) {
        this.name = name;
        this.phone = phone;
        this.nickname = nickname;
        this.email = email;
        this.age = age;
        this.rating = rating;
        this.isOnline = isOnline;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public int getRating() {
        return rating;
    }

    public boolean isOnline() {
        return isOnline;
    }
}
