package com.paperunicorn.workhouse.exception;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;

@ControllerAdvice
public class ExceptionCatcher {

    @ExceptionHandler(value = ServiceException.class)
    protected ResponseEntity<Object> handle(ServiceException ex) {
        HashMap<String , String> errors = new HashMap<>();
        errors.put("message", ex.getMessage());
        errors.put("code", "ooo");
        return new ResponseEntity<>(errors, HttpStatusCode.valueOf(404));
    }
}
