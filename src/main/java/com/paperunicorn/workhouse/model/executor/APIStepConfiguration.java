package com.paperunicorn.workhouse.model.executor;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.http.HttpMethod;

import java.util.Map;

@Data
public class APIStepConfiguration extends StepConfiguration {
    private String stepActionId;
    private String url;
    private Map<String, String> headers;
    private HttpMethod httpMethod;
    private Class returnType;
    private Map<String, String> fieldMapping;
}
