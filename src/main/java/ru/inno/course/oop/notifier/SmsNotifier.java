package ru.inno.course.oop.notifier;

import ru.inno.course.oop.User;

public class SmsNotifier implements Notifier {

    private int tariff = 1;
    public void notify(User user, String text) {
        System.out.println("отправляем смс на " + user.getPhone());
    }
}
