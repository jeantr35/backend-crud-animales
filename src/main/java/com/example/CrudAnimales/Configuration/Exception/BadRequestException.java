package com.example.CrudAnimales.Configuration.Exception;

public class BadRequestException extends RuntimeException{

    public BadRequestException() {
    }

    public BadRequestException(String message) {
        super(message);
    }
}