package demo.baitap.date;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //bai1
        ZonedDateTime tokyoTime=ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime AustraliaSydney=ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
        ZonedDateTime AmericaSao_Paulo=ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println(tokyoTime);
        System.out.println(AustraliaSydney);
        System.out.println(AmericaSao_Paulo);
        //bai2
        LocalTime localDateTime=LocalTime.now();
        System.out.println(localDateTime);
        //bai3
//        System.out.println("nhập ngày bắt đầu");
//        LocalDate start= LocalDate.parse(sc.nextLine());
//        System.out.println("nhập ngày bắt đầu");
//        LocalDate end= LocalDate.parse(sc.nextLine());
//        int days= (int) ChronoUnit.DAYS.between(start,end);
//        System.out.println("khoảng cách giữa 2 ngày"+days);
        //bai4
        LocalDate localTime=LocalDate.now();
        int monthValue=localTime.getMonthValue();
        int year=localTime.getYear();
        YearMonth yearMonth = YearMonth.of(year, monthValue);
        System.out.println("số ngày của tháng"+yearMonth.lengthOfMonth());
        //bai5
        System.out.println("số ngày của năm"+yearMonth.lengthOfYear());
        //bai6

    }
}
