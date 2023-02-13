package com.marek.zmienka.fun;

import java.util.ArrayList;
import java.util.Scanner;

public class A5 {

    public static void run() {
        System.out.println("#### 5. Program to check if given int is in generated array");
        Scanner s = new Scanner(System.in);
        System.out.println("Provide array length");
        int elements = s.nextInt();

        System.out.println("Provide min value");
        int min = s.nextInt();

        System.out.println("Provide max value");
        int max =s.nextInt();

        System.out.println("Provide int");
        int findInt = s.nextInt();

        ArrayList<Integer> array = A4.generateArray(elements, min, max);

        if (findElement(findInt, array)) {
            System.out.println("Got it!");
        } else {
            System.out.println("Not this time!");
        }


    }

    public static boolean findElement(int value, ArrayList<Integer> array) {
        return array.contains(value);
    }

}
