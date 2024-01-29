package ru.inno.course.oop.card;

public class Card {

    private String number;
    private String pinCode;

    public Card(String number, String pinCode) {
        this.number = number;
        this.pinCode = pinCode;
    }

    public String getNumber(){
        String result = this.number.substring(this.number.length() - 4);
        return "**** **** **** " + result;
    }

    public String getUnmaskedNumber(String pinCode) {
        if (pinCode.equals(this.pinCode)){
            return this.number;
        } else {
            return "not authorized";
        }
    }
}
