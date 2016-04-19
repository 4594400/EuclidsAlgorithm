package com.goit.finalTask;

import java.io.PrintWriter;
import java.util.Scanner;

public class Euclid {

    public int greatestCommonDivisor(int a, int b){
        if (b == 0) {
            return a;
        } else {
            return greatestCommonDivisor(b, a % b);
        }
    }
}
