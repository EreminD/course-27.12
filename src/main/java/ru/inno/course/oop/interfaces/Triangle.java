package ru.inno.course.oop.interfaces;

public class Triangle implements Shape {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double getArea() {
        int p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
