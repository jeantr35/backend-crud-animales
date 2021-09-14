package com.example.CrudAnimales.Configuration.Exception;

public class NotFoundException extends RuntimeException{

    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }
}