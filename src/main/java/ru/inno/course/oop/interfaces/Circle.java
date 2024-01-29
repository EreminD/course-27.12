package ru.inno.course.oop.interfaces;

public class Circle implements Shape {

    private double radius;
    private double pi = 3.1415;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return pi * radius * radius;
    }
}
