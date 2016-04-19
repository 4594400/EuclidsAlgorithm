package com.goit.finalTask;


import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
        ScannerUtils scannerUtils = new ScannerUtils();
        Euclid euclid = new Euclid();

        System.out.println("Hi! This program finds the greatest common divisor of two integers.");

        System.out.println("Please input first integer:");
        int a = scannerUtils.readOnlyIntegers(scanner);

        System.out.println("Please input second integer:");
        int b = scannerUtils.readOnlyIntegers(scanner);

        printWriter.println("Greatest common divisor of " + a + " and " + b + " is " + euclid.greatestCommonDivisor(a, b));
        scanner.close();
        printWriter.close();
    }
}
