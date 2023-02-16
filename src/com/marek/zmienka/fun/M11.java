package com.marek.zmienka.fun;

import java.util.Scanner;

class M11 {

    public static final String VALID_CHARS = "qwertyuiopasdfghjklzxcvbnm";
    public static final String VALID_NUMBERS = "0123456789";

    public static void run() {
        String VALID_CHARS = "qwertyuiopasdfghjklzxcvbnm";
        String VALID_NUMBERS = "0123456789";
        System.out.println("#### M11. Password test");
        System.out.println("Provide a string");

        Scanner s = new Scanner(System.in);
        String password = s.nextLine();
        if (!checkLength(password)) {
            System.out.println("A password must have at least ten characters.");
        }
        if (!checkInvalidChars(password)) {
            System.out.println("A password must consist of only letters and digits.");
        }
        if (!checkDigits(password)) {
            System.out.println("A password must contain at least two digits.");
        }
        if (checkLength(password) && checkInvalidChars(password) && checkDigits(password)) {
            System.out.println("Password valid: " + password);
        } else {
            System.out.println("Password invalid: " + password);
        }

    }

    public static boolean checkLength(String password) {
        return password.length() >= 10;
    }

    public static boolean checkDigits(String password) {
        int tempNumber = 0;
        for (int i = 0; i < password.length(); i++) {
            if (VALID_NUMBERS.contains(String.valueOf(password.charAt(i)))) {
                tempNumber += 1;
            }
        }
        return tempNumber >= 2;
    }

    public static boolean checkInvalidChars(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!VALID_CHARS.contains(String.valueOf((password.toLowerCase().charAt(i)))) &&
                    !VALID_NUMBERS.contains(String.valueOf((password.charAt(i))))) {
                return false;
            }
        }
        return true;
    }
}


