package ru.inno.course.oop.notifier;

import ru.inno.course.oop.User;

public class TgNotifier implements Notifier {
    @Override
    public void notify(User user, String text) {
        System.out.println("отправляем tg на " + user.getNickname());
    }
}
