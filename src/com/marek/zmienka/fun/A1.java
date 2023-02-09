package com.marek.zmienka.fun;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class A1 {

    public static String STRING_CHARS = "asdfghjklqwertyuiozxcvbnm";
    public static String INT_CHARS = "0123456789";

    public static void sortArrays() {
        System.out.println("## Program sorting two arrays (int and str ) ## ");
        Scanner s = new Scanner(System.in);
        System.out.println("Provide length of first");
        int intArrLength = s.nextInt();
        System.out.println("Provide length of string");
        int strArrLength = s.nextInt();
        System.out.println(generateStringArray(strArrLength));
        System.out.println(generateIntArray(intArrLength));
        ArrayList<Integer> innt = generateIntArray(intArrLength);
    }

    public static ArrayList<String> generateStringArray(int strArrLength) {
        StringBuilder string = new StringBuilder();
        ArrayList<String> stringArray = new ArrayList<String>();
        Random rand = new Random();
        for (int i = 0; i < strArrLength; i++) {
            int stringLength = rand.nextInt(10);
            for (int j = 0; j < stringLength; j++) {
                string.append(STRING_CHARS.charAt(rand.nextInt(STRING_CHARS.length())));
            }
            stringArray.add(String.valueOf(string));
            string.delete(0, string.length());
        }

        return stringArray;
    }
<<<<<<< HEAD
=======

    public static ArrayList<Integer> generateIntArray(int intArrLength) {
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < intArrLength; i++) {
            intArray.add(rand.nextInt(51233));
        }
        return intArray;
    }
>>>>>>> A1
}
