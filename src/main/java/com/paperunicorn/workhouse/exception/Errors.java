package com.paperunicorn.workhouse.exception;

import lombok.Data;

public enum Errors {
    WORKFLOW_NOT_FOUND("workflow not found", "workflow-404");

    String message;
    String errorCode;

    Errors(String message, String code){
        this.message = message;
        this.errorCode = code;
    }

    public String getMessage(){
        return message;
    }
}
