package com.star.spring.rest.exceptionhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeGlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> handleException(
            NoSearchEmployeeException noSearchEmployeeException
    ) {

        EmployeeIncorrectData data = new EmployeeIncorrectData();
        data.setInfo(noSearchEmployeeException.getMessage());

        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeIncorrectData> handleException(
            Exception exception
    ) {

        EmployeeIncorrectData data = new EmployeeIncorrectData();
        data.setInfo(exception.getMessage());

        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }
}