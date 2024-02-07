package ru.inno.course.basics.date;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Playground {

    public static void main(String[] args) throws InterruptedException {

        LocalDate today = LocalDate.now();

        LocalDate todayPlus10days = today.minusDays(50);

        LocalDate yesterday = LocalDate.of(2024,2,4);
        LocalDate tomorrow = yesterday.plusDays(2);

        System.out.println("today = " + today);
        System.out.println("yesterday = " + yesterday);

        System.out.println( today.isBefore(today) );

        System.out.println(today.minusDays(50).isLeapYear());

        LocalDate subscriptionDate = LocalDate.now().plusDays(90);
        System.out.println(subscriptionDate);

        LocalTime time = LocalTime.now();
        System.out.println("time = " + time);

        LocalTime fromDb = LocalTime.of(21, 18, 59);
        LocalTime noew = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("noew = " + noew);
        System.out.println(fromDb.isBefore(noew));

        LocalDateTime dateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());

        System.out.println(dateTime);


        // yyyy - год
        // MM - месяц
        // dd - день
        // HH - часы
        // mm - минуты
        // ss - секунды
        // SS - наносекунды
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd.MM.yy");
        String timestamp = formatter.format(dateTime);
        System.out.println(timestamp);
//
//        for (int i = 0; i < 1000; i++) {
//            Thread.sleep(1000L);
//            System.out.println(formatter.format(LocalDateTime.now()));
//        }


        String myDate = "05/02/2024";

        LocalDate date = LocalDate.parse(myDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("date = " + date.plusDays(1));

    }
}
