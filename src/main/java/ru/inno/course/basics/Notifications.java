package ru.inno.course.basics;

public class Notifications {

    public static void main(String[] args) {

        boolean agreeToAcceptNotifications = true;
        boolean sendSms = true;
        boolean sendEmail = true;

//        if (agreeToAcceptNotifications) {
//            if (sendSms) {
//                System.out.println("Отправили SMS");
//            }
//
//            if (sendEmail) {
//                System.out.println("Отправляем email");
//            }
//        } else {
//            System.out.println("Не пишем ничего");
//        }

        // логическое НЕ
        if (!agreeToAcceptNotifications){
            System.out.println("Отправляе уведомление");
        } else {
            System.out.println("Не пишем ничего");
        }

        // логическое ИЛИ
        if (agreeToAcceptNotifications && sendSms){
            System.out.println("Отправляем смс");
        }

        // логическое ИЛИ
        if (sendSms || sendEmail) {
            System.out.println("Отправляем уведомление");
        }

        // вроде бы ок.
        if(agreeToAcceptNotifications){
            if (sendSms && !sendEmail) {
                System.out.println("Отправляем смс");
            }

            if (sendEmail && !sendSms){
                System.out.println("Отправляем Email");
            }

            if (!sendEmail && !sendSms) {
                System.err.println("Не можем связаться");
            }
        }
        else {}
    }
}
