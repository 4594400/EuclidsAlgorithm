package com.goit.finalTask.myExceptions;


public class WrongInputDataException extends RuntimeException {
    private String message;

    public WrongInputDataException(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

}
