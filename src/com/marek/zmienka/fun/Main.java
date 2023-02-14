package com.marek.zmienka.fun;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) throws Exception {

        runProgram();
    }

    public static void runProgram() throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Select program to run:");
        int programNumber = s.nextInt();
        switch (programNumber) {
            case 0: {
                AlgList.listOfAlgs();
                runProgram();
            }
            case 1: A1.a1();
            case 4: A4.run();
            case 5: A5.run();
            case 6: A6.run();
            case 8: A8.run();
            case 11: A11.run();
            case 14: A14.run();
            case 16: A16.run();
            case 17: A17.run();
            default: throw new Exception("Wrong choice");
        }
    }

}

