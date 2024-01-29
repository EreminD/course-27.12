package ru.inno.course.oop;

public class Geometry {

    public static void main(String[] args) {

        int a = 5;
        int b = a;
        a = 10;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Car carA = new Car("red", "opel", "zarina", "A11AA177", 120);
        Car carB = carA;
        Car carC = new Car("black", "bmw", "x1", "A123AA01", 150);
        Car carD = null;


        carA.setColor("WHITE");

        System.out.println(carA.getColor());
        System.out.println(carB.getColor());

        int[] nums1 = {10,20,30};
        int[] nums2 = nums1;

        nums1[0] = 40;
        System.out.println(nums2[0]);


        Student student = new Student("alex");
        String o = student.getOtchestvo();
        boolean isBorisSon = o.startsWith("Boris");
        System.out.println(isBorisSon);

        // NullPointerException -- NPE


    }
}
