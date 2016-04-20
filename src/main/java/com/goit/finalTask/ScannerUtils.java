package com.goit.finalTask;


import com.goit.finalTask.myExceptions.WrongInputDataException;

import java.util.Scanner;

public class ScannerUtils {
    public static int count = 3;

    public static int readOnlyIntegers(Scanner in) {
        int integer = 0;
        boolean check = true;
        while (check == true) {
            try {
                if (count == 0) {
                    throw new WrongInputDataException("Input was wrong 3 times. The program has finished.");
                }
                String input = in.nextLine();
                if (input.equals("quit")) {
                    System.err.println("You input \"quit\". The program has finished.");
                    System.exit(0);
                }
                integer = Integer.parseInt(input);
                check = false;
            }  catch (WrongInputDataException w) {
                System.out.println(w.getMessage());
                System.exit(0);
            }  catch (NumberFormatException n) {
                System.err.println("Only integers are allowed. Try again! You have " + (count - 1) + " attempts ->");
                count--;
            }
        }
        return integer;
    }
}
