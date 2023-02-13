package com.marek.zmienka.fun;

import java.util.ArrayList;

public class A8 {

    public static void run() {
        System.out.println("#### 8. Program to iterate by array index");

        ArrayList<Integer> array = A4.generateArrayNoOccurances(10, 1, 50);

        System.out.println(array);
        for (int i = 0; i < array.size(); i++) {
            System.out.println("* " + getValueForArrayIndex(i, array) + " *");
        }

    }

    public static int getValueForArrayIndex(int index, ArrayList<Integer> array) {

        return array.get(index);
        }
    }

