package com.shivank.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2021, 9, 30, 5, 59, 59, 9);
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(localDateTime2);

        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));

        System.out.println(localDateTime.plusHours(2));
        System.out.println(localDateTime.withMonth(12));

        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate.atTime(22, 55));

        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime.atDate(localDate));
    }
}
