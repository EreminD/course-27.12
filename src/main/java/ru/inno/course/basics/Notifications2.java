package ru.inno.course.basics;

public class Notifications2 {

    public static void main(String[] args) {

        // email sms push tg call none

        String preferredWay = "push";

        switch (preferredWay) {
            case "sms":
                System.out.println("отправляем смс");
                break;
            case "email":
                System.out.println("отправляем email");
                break;
            case "tg":
                System.out.println("отправляем tg");
                break;
            case "call":
                System.out.println("manager call");
                break;
            case "none":
                System.out.println("nothing to do");
                break;
            default:
                System.out.println("Нетипичный канал");
        }



    }
}
