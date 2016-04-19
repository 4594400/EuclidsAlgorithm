package com.goit.finalTask;


import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
        Euclid euclid = new Euclid();

        try {
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        printWriter.println("Greatest common divisor of " + a + " and " + b + " is " + euclid.greatestCommonDivisor(a, b));
        } catch (NumberFormatException e) {
            System.out.println("|ERROR| The input values must be integers! Try again.");
        }
        scanner.close();
        printWriter.close();

        //System.out.println(greatestCommonDivisor(a, b));
    }
}
