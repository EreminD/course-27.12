package ru.inno.course.oop.notifier;

import ru.inno.course.oop.User;

//public class PushNotifier implements Notifier{
public class PushNotifier {

    public void notify(User user, String text) {
        System.out.println("отправляем PUSH на " + user.getPhone());
    }

}
