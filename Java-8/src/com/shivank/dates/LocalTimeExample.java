package com.shivank.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime: " + localTime);

        LocalTime localTime1 = LocalTime.of(23, 33);
        System.out.println("localTime1: " + localTime1);

        LocalTime localTime2 = LocalTime.of(23, 33, 33);
        System.out.println("localTime2: " + localTime2);

        LocalTime localTime3 = LocalTime.of(23, 33, 33, 989898989);
        System.out.println("localTime3: " + localTime3);

        System.out.println("getHour: " + localTime.getHour());
        System.out.println("getMinute: " + localTime.getMinute());
        System.out.println("getSecond: " + localTime.getSecond());
        System.out.println("getNano: " + localTime.getNano());
        System.out.println(localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println(localTime.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(localTime.toSecondOfDay());
        System.out.println(localTime.toNanoOfDay());

        System.out.println(localTime.minusHours(2));
        System.out.println(localTime.minus(2, ChronoUnit.MINUTES));

        System.out.println(localTime.with(LocalTime.MIDNIGHT));
        System.out.println(localTime.with(ChronoField.HOUR_OF_DAY, 22));

        System.out.println(localTime.plus(2, ChronoUnit.MINUTES));
    }
}
