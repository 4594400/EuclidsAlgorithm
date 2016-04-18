package com.goit.finalTask;

import java.io.PrintWriter;
import java.util.Scanner;

public class Euclid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);

        int a;
        a = scanner.nextInt();
        int b;
        b = scanner.nextInt();

        printWriter.println(greatestCommonDivisor(a, b));

        scanner.close();
        printWriter.close();

        //System.out.println(greatestCommonDivisor(a, b));
    }

    public static int greatestCommonDivisor(int a, int b){
        if (b == 0) {
            return a;
        } else {
            return greatestCommonDivisor(b, a % b);
        }
    }
}
