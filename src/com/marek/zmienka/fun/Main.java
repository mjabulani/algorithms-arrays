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
<<<<<<< HEAD
            case 0: {
                AlgList.listOfAlgs();
                runProgram();
            }
            case 1: A1.a1();
                break;
=======
            case 1: A1.sortArrays();
            break;
>>>>>>> A1
            default: throw new Exception("Wrong choice");
        }
    }

}

