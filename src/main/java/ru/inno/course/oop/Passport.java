package ru.inno.course.oop;

public class Passport {
    String serial;
    String number;
    String firstName;
    String lastName;
    String middleName = "";
    Issuer kem_vidan_passport;

    public Passport(String serial, String number, String firstName, String lastName, String middleName){
        this.serial = serial;
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public Passport(String serial, String number, String firstName, String lastName){
        this.serial = serial;
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Passport(String firstName, String lastName, Issuer issuer){
        this.firstName = firstName;
        this.lastName = lastName;
        this.kem_vidan_passport = issuer;
    }

}
