package com.goit.finalTask.exceptions;

public class WrongInputDataException extends NumberFormatException {
    private String dataInput;

    public WrongInputDataException(String dataInput) {
        this.dataInput = dataInput;
    }

    public String getDataInput() {
        return dataInput;
    }
}
