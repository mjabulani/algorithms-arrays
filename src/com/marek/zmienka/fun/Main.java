package com.marek.zmienka.fun;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) throws Exception {
        
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
            break;
            default: throw new Exception("Wrong choice");
        }
    }

}

