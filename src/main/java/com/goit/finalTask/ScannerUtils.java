package com.goit.finalTask;


import com.goit.finalTask.myExceptions.ExceedingTheNumberOfAllowedAttemptsToEnterException;

import java.util.Scanner;

public class ScannerUtils {
    private int count = 3;

    public int readOnlyIntegers(Scanner in) {
        int integer = 0;
        boolean check = true;
        while (check) {
            try {
                if (count == 0) {
                    throw new ExceedingTheNumberOfAllowedAttemptsToEnterException("Input was wrong 3 times. The program has finished.");
                }
                String input = in.nextLine();
                if (input.equals("quit")) {
                    System.err.println("You input \"quit\". The program has finished.");
                    System.exit(0);
                }
                integer = Integer.parseInt(input);
                check = false;
            }  catch (NumberFormatException n) {
                count--;

                System.err.println("Only integers are allowed. You have " + (count) + " attempts ->");
            }  catch (ExceedingTheNumberOfAllowedAttemptsToEnterException w) {
                System.out.println(w.getMessage());
                System.exit(0);
            }
        }
        return integer;
    }


}
