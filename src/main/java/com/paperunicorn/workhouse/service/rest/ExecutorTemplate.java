package com.paperunicorn.workhouse.service.rest;

import com.paperunicorn.workhouse.model.rest.RestCallerDetails;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class ExecutorTemplate {

    @Autowired
    private RestTemplate restTemplate;

    public void plainExecute(RestCallerDetails restcaller) throws URISyntaxException {
        restTemplate.postForEntity(new URI(restcaller.getUrl()), restcaller.getBody(), JSONObject.class);
    }
}
