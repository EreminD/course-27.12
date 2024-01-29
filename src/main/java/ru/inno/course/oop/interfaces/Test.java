package ru.inno.course.oop.interfaces;

public class Test {

    public static void main(String[] args) {

        Circle circle = new Circle(10);
        Rect rect = new Rect(5, 10);
        Triangle triangle = new Triangle(3,4,5);

        Shape[] shapes = new Shape[]{circle, rect, triangle};

        new AreaPrinter().printAreas(shapes);

    }
}
