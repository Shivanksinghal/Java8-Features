package com.shivank.dates;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class ComparingDatePeriodExample {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2018, 1, 1);
        LocalDate localDate2 = LocalDate.of(2018, 12, 31);

        Period period = localDate.until(localDate2);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());

        Period period1 = Period.ofDays(10);
        System.out.println(period1.getDays());

        Period period2 = Period.ofYears(10);
        System.out.println(period2.getYears());
        System.out.println(period2.toTotalMonths());

        Period period3 = Period.between(localDate, localDate2);
        System.out.println(period3);
        System.out.println(period3.getDays());
        System.out.println(period3.getMonths());
        System.out.println(period3.getYears());
        System.out.println(period3.toTotalMonths());
    }
}
