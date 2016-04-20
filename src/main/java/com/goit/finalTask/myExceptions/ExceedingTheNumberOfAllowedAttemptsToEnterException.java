package com.goit.finalTask.myExceptions;


public class ExceedingTheNumberOfAllowedAttemptsToEnterException extends RuntimeException{
    private String message;

    public String getMessage() {
        return message;
    }

    public ExceedingTheNumberOfAllowedAttemptsToEnterException(String message) {
        this.message = message;
    }
}
