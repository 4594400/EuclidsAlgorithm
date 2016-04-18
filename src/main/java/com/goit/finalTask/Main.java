package com.goit.finalTask;


import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
        Euclid euclid = new Euclid();

        int a;
        a = scanner.nextInt();
        int b;
        b = scanner.nextInt();

        printWriter.println(euclid.greatestCommonDivisor(a, b));

        scanner.close();
        printWriter.close();

        //System.out.println(greatestCommonDivisor(a, b));
    }
}
