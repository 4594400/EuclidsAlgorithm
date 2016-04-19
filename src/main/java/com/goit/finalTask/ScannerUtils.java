package com.goit.finalTask;


import java.util.Scanner;

public class ScannerUtils {
    public static int count = 3;

    public static int readOnlyIntegers(Scanner in) {
        int integer;
        try {
            String input = in.nextLine();
            if (input.equals("quit") | count==0) {
                System.exit(0);
            }
            integer = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.err.println("Only integers are allowed. Enter \"quit\" to exit the program or try again! You have " + count + " attempts ->");
            count--;
            integer = readOnlyIntegers(in);
        }
        return integer;

    }
}
