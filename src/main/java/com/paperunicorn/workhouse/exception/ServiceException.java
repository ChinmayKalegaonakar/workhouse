package com.paperunicorn.workhouse.exception;

public class ServiceException extends RuntimeException {

    private String message;

    public ServiceException(Errors error){
        this.message = error.getMessage();
    }

    public String getMessage(){
        return this.message;
    }
}
