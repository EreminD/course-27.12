package ru.inno.course.oop.interfaces;

public class Rect implements Shape {

    private double a;
    private double b;

    public Rect(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double perimeter(){
        return 2*a + 2*b;
    }

    @Override
    public double getArea() {
        return a*b;
    }
}
