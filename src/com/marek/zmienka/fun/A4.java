package com.marek.zmienka.fun;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class A4 {

    public static void run() {

        System.out.println("#### 4. Program to calculate av value of generated array of ints");
        Scanner s = new Scanner(System.in);
        System.out.println("Please provide length of array");
        int elements = s.nextInt();
        System.out.println("Min value?");
        int min = s.nextInt();
        System.out.println("Max value?");
        int max = s.nextInt();

        ArrayList<Integer> array = generateArray(elements, min, max);
        System.out.println("Array: " + array);
        System.out.println("Av: " + calcAv(array));
    }

    public static ArrayList<Integer> generateArray(int length, int min, int max) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random r = new Random();
        if (min >= max) {
            throw new IllegalArgumentException("min must be < than max ");
        } else {
            for (int i = 0; i < length; i++) {
                int tempValue = r.nextInt((max - min) + 1) + min;
                array.add(tempValue);
            }
        }


        return array;
    }

    public static float calcAv(ArrayList<Integer> array) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }

        return ((float) sum) / array.size();
    }
}
