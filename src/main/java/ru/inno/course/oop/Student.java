package ru.inno.course.oop;

public class Student {

    private String otchestvo;
    private String name;

    private boolean age;

    public Student(String name) {
        this.name = name;
    }

    public String getOtchestvo() {
        return this.otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public String getName() {
        return name;
    }

    public boolean getAge() {
        return age;
    }
}
