package com.paperunicorn.workhouse.model.rest;

import lombok.Data;
import org.json.simple.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

@Data
public class RestCallerDetails {
    private String url;
    private HttpMethod method;
    private JSONObject body;
    private HttpHeaders headers;
    private Class returnType;
}
