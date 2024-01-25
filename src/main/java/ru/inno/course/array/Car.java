package ru.inno.course.array;

public class Car {
    String color;
    String brand;
    String model;
    int hp;
    String[] passengers;

    public Car(String color, String brand, String model, int hp) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.hp = hp;
        this.passengers = new String[4];
    }
}
