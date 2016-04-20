package com.goit.finalTask.MyException;


public class WrongInputDataException extends RuntimeException {
    private String message;

    public WrongInputDataException(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

}
