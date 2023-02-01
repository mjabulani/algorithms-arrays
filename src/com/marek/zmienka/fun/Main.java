package com.marek.zmienka.fun;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        System.out.println("Select program to run:");
        int programNumber = s.nextInt();
        switch (programNumber) {
            case 1: A1.a1();
            default: throw new Exception("Wrong choice");
        }
    }
}

