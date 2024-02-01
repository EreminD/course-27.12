package ru.inno.course.oop.notifier;

import ru.inno.course.oop.User;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Playground {

    public static void main(String[] args) {
        User usr = new User("Tim", "+6789098765567", "@lkjhgfcvbnm", "efef@mail.ru", 18, 0, true);

        System.out.println("Введите канал уведомлений: t/s/e: ");

        Scanner sc = new Scanner(System.in);
        String notificationType = sc.nextLine();

        // Паттерны проектирования. Стратегия.
        Notifier notifier = null;

        if (notificationType.startsWith("s")) {
            notifier = new SmsNotifier();
        }

        if (notificationType.startsWith("t")) {
            notifier = new TgNotifier();
        }

        if (notificationType.startsWith("e")) {
            notifier = new EmailNotifier();
        }

        notifier.notify(usr, "test");

    }

}
