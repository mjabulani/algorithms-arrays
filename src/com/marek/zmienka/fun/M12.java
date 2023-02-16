package com.marek.zmienka.fun;

import java.awt.desktop.SystemSleepEvent;
import java.util.Random;
import java.util.Scanner;

public class M12 {

    public static void run() {
        System.out.println("#### 212. Draw matrix");
        Scanner s = new Scanner(System.in);
        System.out.println("Provide size of matrix");
        int n = s.nextInt();
    }

    public static void printMatrix(int n) {
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(r.nextInt(2) + " ");
            }
            System.out.println("");
        }

    }
}
