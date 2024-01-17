package ru.inno.course.oop;

public class UserBad {

    public static void main(String[] args) {

        // держать информацию о пользователе Иван
        String ivan = "Иван;SuperIvan;";
        String elena = "Елена;;18;15;elena@mail.ru";

        String name = elena.substring(0, elena.indexOf(";")); // [x, y)
        System.out.println(name);

        String ivanName = "Иван";
        String ivanNickname = "SuperIvan";
        String ivanEmail = "ivan@mail.ru";
        int ivanAge = 14;
        int ivanRating = 10;
        boolean isIvanOnline = true;

        String elenaName = "Елена";
        String elenaNickname = "SuperElena";
        String elenaEmail = "elena@mail.ru";
        int elenaAge = 18;
        int elenaRating = 15;
        boolean isElenaOnline = true;



    }
}
