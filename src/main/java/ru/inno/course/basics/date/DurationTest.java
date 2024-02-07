package ru.inno.course.basics.date;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest {

    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();
        LocalDateTime inPast = today.minusDays(1).minusHours(5);

        Duration duration = Duration.between(inPast, today);

        System.out.println( duration.toDays() );
        System.out.println( duration.toHours() );
        System.out.println( duration.toMinutes() );

    }
}
