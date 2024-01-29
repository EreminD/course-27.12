package ru.inno.course.oop.card;

public class Tester {

    public static void main(String[] args) {

        Card card = new Card("1234567887654321", "1357");

        String number = card.getNumber();
        System.out.println("number = " + number);

        String unmasked = card.getUnmaskedNumber("1357");
        System.out.println("unmasked = " + unmasked);


    }
}
