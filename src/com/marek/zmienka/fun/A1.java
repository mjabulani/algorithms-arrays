package com.marek.zmienka.fun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class A1 {

    public static String STRING_CHARS = "asdfghjklqwertyuiozxcvbnm";

    public static void a1() {


        ArrayList<String> arrayStr = generateStringArray();
        ArrayList<Integer> arrayInt = generateArray();

        System.out.println("Unsorted array of ints: " + arrayInt);
        System.out.println("Unsorted array of strings: " + arrayStr);

        Collections.sort(arrayInt);
        Collections.sort(arrayStr);

        System.out.println("Sorted array of ints: " + arrayInt);
        System.out.println("Sorted array of strings: " + arrayStr);

    }


    public static ArrayList<Integer> generateArray() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Random rand = new Random();

        while (array.size() < 10) {
            int temp = rand.nextInt(500);
            if (!array.contains(temp)) {
                array.add(temp);
            }
        }
        return array;
    }

    public static ArrayList<String> generateStringArray() {
        ArrayList<String> array = new ArrayList<String>();
        Random rand = new Random();
        while (array.size() < 10) {
            StringBuilder tempString = generateString();
            String s = tempString.toString();
            array.add(s);
        }
        return array;
    }

    public static StringBuilder generateString() {
        StringBuilder string = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < 8; i++) {
            string.append(STRING_CHARS.charAt(rand.nextInt(STRING_CHARS.length())));
        }
        return string;
    }



}
