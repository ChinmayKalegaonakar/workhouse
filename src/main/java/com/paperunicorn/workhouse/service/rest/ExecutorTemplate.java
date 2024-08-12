package com.paperunicorn.workhouse.service.rest;

import com.paperunicorn.workhouse.model.executor.APIStepConfiguration;
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

    public void plainExecute(APIStepConfiguration executor) throws URISyntaxException {
        restTemplate.postForEntity(new URI(executor.getUrl()), executor.getFieldMapping(), JSONObject.class);
    }
}
