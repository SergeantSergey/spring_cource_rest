package com.star.spring.rest.exceptionhandling;

public class NoSearchEmployeeException extends RuntimeException {

    public NoSearchEmployeeException(String message) {
        super(message);
    }
}
