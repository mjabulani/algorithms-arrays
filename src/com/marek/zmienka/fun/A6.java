package com.marek.zmienka.fun;

import java.util.ArrayList;
import java.util.Scanner;

public class A6 {

    public static void run() {
        System.out.println("#### 6. Program to get index of element in generated array (if contains)");

        ArrayList<Integer> array = A4.generateArrayNoOccurances(10, 2, 43);
        System.out.println("Generated array: " + array);

        System.out.println("Provide an int to get an index for");
        Scanner s = new Scanner(System.in);

        int value = s.nextInt();

        if (array.contains(value)) {
            System.out.println(array.indexOf(value));
        }
        else {
            throw new IllegalArgumentException("No such a number in array!");
        }
    }




}
