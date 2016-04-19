package com.goit.finalTask;


import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
        Euclid euclid = new Euclid();

        System.out.println("Hi! This program finds the greatest common divisor of two integers.");

        try {
            System.out.println("Please input first integer:");
        int a = Integer.parseInt(scanner.nextLine());
            System.out.println("Please input second integer:");
        int b = Integer.parseInt(scanner.nextLine());

            printWriter.println("Greatest common divisor of " + a + " and " + b + " is " + euclid.greatestCommonDivisor(a, b));
        } catch (NumberFormatException e) { // можем создать и собственное исключение
            System.out.println("|ERROR| The input values must be integers! Try again.");
        }
        scanner.close();
        printWriter.close();

    }
}
