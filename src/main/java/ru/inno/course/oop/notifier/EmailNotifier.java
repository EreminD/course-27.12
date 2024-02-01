package ru.inno.course.oop.notifier;

import ru.inno.course.oop.User;

public class EmailNotifier implements Notifier{

    private String domain = "ya.ru";

    @Override
    public void notify(User user, String text) {
        System.out.println("отправляем email на " + user.getEmail());
    }
}
