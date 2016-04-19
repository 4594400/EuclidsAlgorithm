package com.goit.finalTask;


import java.util.Scanner;

public class ScannerUtils {
    public static int readOnlyIntegers(Scanner in) throws InterruptedException {
        int integer;
        try {
            String input = in.nextLine();

            for (int i = 0; i < input.length(); i++) {
                Thread.sleep(3);
            }
            if (input.equals("quit")) {
                System.exit(0);
            }
            integer = Integer.parseInt(input);
        } catch (NumberFormatException | InterruptedException e) {
            System.err.println("Only integers are allowed. Try again or enter \"quit\" to exit the program! ->");
            integer = readOnlyIntegers(in);
        }
        return integer;
    }
}
