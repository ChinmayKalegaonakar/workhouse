package com.paperunicorn.workhouse.service.executor;

import com.paperunicorn.workhouse.model.StepAction;
import com.paperunicorn.workhouse.model.StepActionInput;
import org.bson.json.JsonObject;
import org.json.simple.JSONObject;

public class APIExecutor implements Executor {
    @Override
    public void execute(StepAction stepAction) {
        JSONObject jsonObject = new JSONObject();
        for(StepActionInput stepActionInput : stepAction.getInputs()){
            jsonObject.put(stepActionInput.getKey(), stepActionInput.getValue());
        }

    }
}
