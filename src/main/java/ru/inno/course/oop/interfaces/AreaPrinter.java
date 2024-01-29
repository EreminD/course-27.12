package ru.inno.course.oop.interfaces;

public class AreaPrinter {
    public void printAreas(Shape[] shapes){
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }
}
