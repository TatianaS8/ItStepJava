package com.itstep.Lesson16;


import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
//https://www.baeldung.com/java-8-date-time-intro

public class JavaTime {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println(LocalDateTime.now());
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());

//        System.out.println(LocalDate.now().plusDays(2));
//        System.out.println(LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.SUNDAY)));// data din duminica urmatoare
     System.out.println(LocalDate.of(2020, 02, 27).with(TemporalAdjusters.lastDayOfMonth()));
//        System.out.println(LocalDateTime.of(1934, 4, 23, 4, 2));
       System.out.println(LocalDate.of(1983, 12, 3).getMonth()
              .getDisplayName(TextStyle.SHORT, Locale.getDefault()));

//        System.out.println(LocalDate.of(1983, 12, 3));

//      Afisarea timpului in formatul dorit
        //LocalDateTime myTime=LocalDateTime.of(2020, 3, 12, 2, 2, 5);
        // System.out.println();

       // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MMM dd HH-mm-ss");
        //System.out.println( formatter.format(myTime));

//        DateTimeFormatter formatter1=DateTimeFormatter.BASIC_ISO_DATE;
//        System.out.println( formatter1.format(myTime));
        // LocalDateTime time=LocalDateTime.parse("2020 Jul 12 15-14-13", formatter);
        // System.out.println(time.plusHours(29).format(formatter));

        //LocalDateTime time=LocalDateTime.parse("2020 Jul 12 15-14-13", formatter);
        // System.out.println(time.plusHours(2).format(formatter));

        //   LocalDateTime time =LocalDateTime.parse("2020 Jul 12 15-14-13",formatter);
        // System.out.println(time.plusHours(29).format(formatter));
//        System.out.println(LocalTime.MAX);
//
//        String text = "Hello each second";
//        int maxSecond = 30;
//        LocalTime start = LocalTime.now();
//        //LocalTime end=LocalTime.now().plusSeconds(15);
//        do {
//            System.out.println(text + LocalTime.now());
//            Thread.sleep(15000); // Pause for 15 second
//        }
//        while (LocalTime.now().isBefore(start.plusSeconds(maxSecond)));
//        //while (LocalTime.now().isBefore(end));

        LocalTime start=LocalTime.now();
        LocalTime end = LocalTime.now().plusSeconds(767675765);
        System.out.println(Duration.between(start, end).toMinutes());
//
//        LocalDateTime time=LocalDateTime.now();
//        System.out.println("Time in Chisinau is: "+ time.toString());
//        ZonedDateTime zonedDateTime=ZonedDateTime.from(time).withZoneSameInstant(ZoneId.of("europe/Paris"));
//        System.out.println("time in Paris is:"+ zonedDateTime.toString());
    }
}
