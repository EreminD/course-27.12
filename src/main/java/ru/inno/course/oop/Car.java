package ru.inno.course.oop;

public class Car {
    private String color;
    private String brand;
    private String model;
    private String plateNumber;
    private int hp;

    public Car(String color, String brand, String model, String plateNumber, int hp) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.plateNumber = plateNumber;
        this.hp = hp;
    }

    public String getColor() {
        return color;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setColor(String newCarColor){
        this.color = newCarColor;
    }

}
