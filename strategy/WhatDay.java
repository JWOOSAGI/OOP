package strategy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Supplier;
enum Week{
    SUNDAY("sunday", ()-> "일요일"),
    MONDAY("monday", ()-> "월요일"),
    TUESDAY("tuesday", ()-> "화요일"),
    WEDNESDAY("wednesday", ()-> "수요일"),
    THURSDAY("thursday", ()-> "목요일"),
    FRIDAY("friday", ()-> "금요일"),
    SATURDAY("saturday", ()-> "토요일")
    ;
    private final String week;
    private final Supplier<String> supplier;

    Week(String week, Supplier<String> supplier) {
        this.week = week;
        this.supplier = supplier;
    }
    public static String getKoreanDay(String week) {
        return getOperator(week).supplier.get();
    }

    private static Week getOperator(String day) {
        return Arrays.stream(values())
                .filter(o -> o.week.equals(day))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 값이 아닙니다."));
    }
}
public class WhatDay {
    String getKoreanDay(String week) {
        return Week.getKoreanDay(week);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("무슨 요일");
        WhatDay w = new WhatDay();
        String s = w.getKoreanDay(sc.next());
        System.out.println(s);
    }
}
