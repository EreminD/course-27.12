package ru.inno.course.oop;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // method
    // public - доступен откуда угодно
    // void - ничего не возвращает назад
    // setBonus - имя метода
    // () - параметры

    public void setBonus(double percent){
        if (percent < 0){
            percent = percent * -1;
        }
        this.salary = this.salary * (1 + percent);
    }

}
