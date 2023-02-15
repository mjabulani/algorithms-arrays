package com.marek.zmienka.fun;

import java.util.Scanner;

public class M10 {

    public static void run() {
        System.out.println("#### M8. Lap year test\nProvide a year (int)");
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();

        System.out.println("Is [" + year + "] a leap year: " + isLeap(year));

    }

    public static boolean isLeap(int year) {

        if ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0) {
            return true;
        }
        return false;
    }
}
