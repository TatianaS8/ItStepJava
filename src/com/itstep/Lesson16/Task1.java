package com.itstep.Lesson16;

import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Task1 {
    public static void main(String[] args)  {

        LocalDate localDate=LocalDateTime.of(2020, 6, 13, 7, 6, 6).toLocalDate();
        System.out.println(localDate.with(TemporalAdjusters.lastDayOfMonth()));

        System.out.println(LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek());

        LocalDate start=LocalDate.of(2020, 6, 13);
        LocalDate end = LocalDate.of(2019, 6, 13);
        System.out.println(ChronoUnit.DAYS.between(start, end));

        LocalTime start1=LocalTime.of(6, 6, 13);
        LocalTime end1 = LocalTime.of(9, 6, 13);
        System.out.println(ChronoUnit.SECONDS.between(start1, end1));

        System.out.println(LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.MONDAY)));


        LocalDateTime myTime=LocalDateTime.of(2020, 6, 13, 6, 2, 5);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy / MMM / dd H(a):mm:ss");
        System.out.println(formatter.format(myTime));










        }


    }
