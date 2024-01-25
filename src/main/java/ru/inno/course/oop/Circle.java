package ru.inno.course.oop;

public class Circle {

    private double pi = 3.1415;
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void printArea(){
        double area = radius*radius*pi;
        System.out.println(area);
    }

}
