package com.paperunicorn.workhouse.model.executor;

import lombok.Data;
import org.springframework.http.HttpMethod;

import java.util.Map;

@Data
public class APIStepExecutor extends StepExecutor{
    private String url;
    private Map<String, String> headers;
    private HttpMethod httpMethod;
    private Class returnType;
    private Map<String, String> fieldMapping;
}
