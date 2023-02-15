package com.marek.zmienka.fun;


import java.util.Scanner;

public class M8 {


    public static void run() {
        Scanner s = new Scanner(System.in);
        System.out.println("#### M8. Calculate your investment calculability\nProvide investment time horizont (years)");
        double years = s.nextDouble();
        System.out.println("Provide year intrest rate (%)");
        double rate = s.nextFloat() / 100;
        System.out.println("Initial balance");
        double initialBalance = s.nextDouble();
        System.out.println("Years         FutureValue");
        for (double i = 1; i <= years; i++) {
            System.out.println((int ) i +  "             " + (investmentValue(i, rate, initialBalance)));
        }
    }

    public static double investmentValue(double years, double rate, double initialBalance) {
        return initialBalance *  Math.pow((1 + rate), years);
    }
}
