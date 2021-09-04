package com.shivank.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalField;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate: " + localDate);

        LocalDate localDate1 = LocalDate.of(2021, 9, 5);
        System.out.println("localDate1: " + localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2021, 56);
        System.out.println("localDate2: " + localDate2);

        /**
         * Get values from date
         */
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.get(ChronoField.ALIGNED_WEEK_OF_YEAR));
        System.out.println(localDate1.get(ChronoField.ALIGNED_WEEK_OF_YEAR));

        /**
         * Modifying local date
         */
        System.out.println(localDate.plusDays(2));
        System.out.println(localDate.minusDays(3));
        System.out.println(localDate.withYear(2022));
        System.out.println(localDate.with(ChronoField.ALIGNED_WEEK_OF_YEAR, 37));
        System.out.println(localDate.with(TemporalAdjusters.firstDayOfMonth()));
    }
}
