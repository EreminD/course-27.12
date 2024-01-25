package ru.inno.course.oop;

public class Office {

    public static void main(String[] args) {

        Employee jack = new Employee("Jack", 90);
        Employee marta = new Employee("Marta",  100);

        marta.setBonus(0.2);
        jack.setBonus(0.3);

        System.out.println(jack.salary);
        System.out.println(marta.salary);

        marta.setBonus(0.05);
        System.out.println(marta.salary);

        jack.setBonus(-0.99);
        System.out.println(jack.salary);


    }
}
