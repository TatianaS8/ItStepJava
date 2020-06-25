package com.itstep.Lesson16;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class JavaTime1 {
    public static void main(String[] args) {
//        System.out.println(LocalDate.now());
//        System.out.println(LocalDate.now().minusMonths(3));

        LocalDate localDate=LocalDateTime.of(2020, 4, 5, 6, 5, 7).toLocalDate();
        System.out.println(localDate.with(TemporalAdjusters.lastDayOfMonth()));
    }
}
