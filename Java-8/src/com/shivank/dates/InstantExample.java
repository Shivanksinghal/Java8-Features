package com.shivank.dates;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

public class InstantExample {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(Instant.now().toEpochMilli());
        System.out.println(Instant.ofEpochMilli(1630748518825l));

        TimeZone timeZone = TimeZone.getDefault();
        System.out.println(timeZone.getID());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.atZone(ZoneId.of(timeZone.getID())));
    }
}
