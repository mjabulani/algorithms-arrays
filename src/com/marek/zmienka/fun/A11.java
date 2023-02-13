package com.marek.zmienka.fun;

import java.util.ArrayList;

public class A11 {

    public static void run() {

        System.out.println("#### 11. Program to reverse given int array");

        ArrayList<Integer> array = A4.generateArrayNoOccurances(25, 3, 80);

        System.out.println("Array: " + array);
        System.out.println("Reversed array: " + reverseArray(array));


    }

    public static ArrayList<Integer> reverseArray(ArrayList<Integer> array) {

        ArrayList<Integer> reversedArray = new ArrayList<Integer>();
        for (int i = array.size() - 1; i >= 0; i--) {
            reversedArray.add(array.get(i));
        }
        return reversedArray;
    }

}
