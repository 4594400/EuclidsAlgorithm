package com.goit.finalTask;

public class Euclid {

    public int greatestCommonDivisor(int a, int b){
        if (b == 0) {
            return a;
        } else {
            return greatestCommonDivisor(b, a % b);
        }
    }
}
