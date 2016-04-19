package com.goit.finalTask;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtils {
    public static int readOnlyIntegers(Scanner in) {
        int integer;
        try {
            integer = in.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Only integers are allowed. Try again! ->");
            in.nextLine();
            integer = readOnlyIntegers(in);
        }
        return integer;
    }
}
