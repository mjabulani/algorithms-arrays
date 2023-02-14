package com.marek.zmienka.fun;

import java.util.ArrayList;
import java.util.Collections;

public class A14 {



    public static void run() {

        System.out.println("#### 14. Program to find common elementos of two generated arrays of int");

        ArrayList<Integer> array1 = A4.generateArrayNoOccurances(8, 20, 40);
        ArrayList<Integer> array2 = A4.generateArrayNoOccurances(8, 21, 54);

        Collections.sort(array1);
        Collections.sort(array2);
        System.out.println(array1);
        System.out.println(array2);

        System.out.println("Common elements: " + commonElements(array1, array2));
    }

    public static ArrayList<Integer> commonElements(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        ArrayList<Integer> common = new ArrayList<Integer>();

        if (array1.size() >= array2.size()) {
            for (Integer integer : array2) {
                if (array1.contains(integer)) {
                    common.add(integer);
                }
            }

        } else {
            for (Integer integer : array1) {
                if (array2.contains(integer)) {
                    common.add(integer);
                }
            }
        }

        return common;
    }
}

