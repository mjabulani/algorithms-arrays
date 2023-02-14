package com.marek.zmienka.fun;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class A16 {

    public static void main(String[] args) {
        run();
    }
    public static void run() {
        System.out.println("#### 16. Remove duplicates from int array");
        ArrayList<Integer> arr = A4.generateArray(10, 5, 7);
        System.out.println(arr);
        System.out.println(removeDuplicates(arr));


    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arr) {
        HashSet<Integer> set = new HashSet<Integer>(arr);

        return new ArrayList<Integer>(set);
    }



}
