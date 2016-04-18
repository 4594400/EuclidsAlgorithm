package com.goit.finalTask.exceptions;

public class WrongDataException extends Exception {
    private int inputValue;
    private String dataInput;

    public WrongDataException(int inputValue) {
        this.inputValue = inputValue;
    }

    public WrongDataException(String dataInput) {
        this.dataInput = dataInput;
    }

    public int getInputValue() {
        return inputValue;
    }

    public String getDataInput() {
        return dataInput;
    }
}

// NullArgumentException
// MathIllegalArgumentException
//Exception
//        RuntimeException
//    NoSuchElementException
//            InputMismatchException
//    IllegalArgumentException
//            NumberFormatException
//    ArithmeticException
//            NullPointerException
