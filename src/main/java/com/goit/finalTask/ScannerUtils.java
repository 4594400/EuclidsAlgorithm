package com.goit.finalTask;

import com.goit.finalTask.exceptions.WrongInputDataException;

import java.util.Scanner;

public class ScannerUtils {
    public static int readOnlyIntegers(Scanner in) {
        int integer;
        try {
            String input = in.nextLine();
            if (input.equals("quit")) {
                System.exit(0);
            }
            integer = Integer.parseInt(input);
        } catch (WrongInputDataException e) {
            System.err.println("Only integers are allowed. Try again or enter \"quit\" to exit the program! ->");
            integer = readOnlyIntegers(in);
        }
        return integer;
    }
}
