package com.paperunicorn.workhouse.service.executor;

import com.paperunicorn.workhouse.model.executor.APIStepConfiguration;
import com.paperunicorn.workhouse.model.executor.StepConfiguration;
import com.paperunicorn.workhouse.model.executor.StepConfigurationType;
import com.paperunicorn.workhouse.model.workflow.StepAction;
import com.paperunicorn.workhouse.model.workflow.StepActionInput;
import com.paperunicorn.workhouse.model.rest.RestCallerDetails;
import com.paperunicorn.workhouse.repository.StepActionRepository;
import com.paperunicorn.workhouse.repository.StepConfigurationRepository;
import com.paperunicorn.workhouse.service.rest.ExecutorTemplate;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

@Service
public class APIExecutor implements Executor {

    @Autowired
    ExecutorTemplate executorTemplate;

    @Autowired
    private StepActionRepository stepActionRepository;

    @Autowired
    private StepConfigurationRepository stepConfigurationRepository;

    @Override
    public void execute(StepAction stepAction) {
        StepConfiguration stepConfiguration = stepConfigurationRepository.findByStepActionId(stepAction.getId()).orElseThrow(()-> new RuntimeException());

        Map<String, String> body = new HashMap<>();
        for(StepActionInput stepActionInput : stepAction.getInputs()){
            body.put(stepActionInput.getKey(), stepActionInput.getValue().toString());
        }

        try {
            if(stepConfiguration.getType().equals(StepConfigurationType.API)){
                APIStepConfiguration apiStepConfiguration = (APIStepConfiguration) stepConfiguration;
                apiStepConfiguration.setFieldMapping(body);
                executorTemplate.plainExecute(apiStepConfiguration);
            }
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
