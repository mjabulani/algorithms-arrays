package com.marek.zmienka.fun;

import java.util.ArrayList;
import java.util.Collections;

public class A17 {


    public static void run() {
        System.out.println("#### 17. Program listing second largest int in generated array");

        ArrayList<Integer> arr = A4.generateArrayNoOccurances(10, 5, 100);
        System.out.println(arr);
        System.out.println("Second largest: " + secondLargest(arr));
    }


    public static int secondLargest(ArrayList<Integer> arr) {

        Collections.sort(arr);

        return arr.get(arr.size()-2);
    }


}
