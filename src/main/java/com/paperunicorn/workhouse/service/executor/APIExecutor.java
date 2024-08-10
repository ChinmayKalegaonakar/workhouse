package com.paperunicorn.workhouse.service.executor;

import com.paperunicorn.workhouse.model.workflow.StepAction;
import com.paperunicorn.workhouse.model.workflow.StepActionInput;
import com.paperunicorn.workhouse.model.rest.RestCallerDetails;
import com.paperunicorn.workhouse.service.rest.ExecutorTemplate;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;

@Service
public class APIExecutor implements Executor {

    @Autowired
    ExecutorTemplate executorTemplate;

    @Override
    public void execute(StepAction stepAction) {
        JSONObject jsonObject = new JSONObject();
        for(StepActionInput stepActionInput : stepAction.getInputs()){
            jsonObject.put(stepActionInput.getKey(), stepActionInput.getValue());
        }

        RestCallerDetails restCallerDetails = new RestCallerDetails();
        restCallerDetails.setBody(jsonObject);
        restCallerDetails.setUrl("localhost:9091/v1/2");
        try {
            executorTemplate.plainExecute(restCallerDetails);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
