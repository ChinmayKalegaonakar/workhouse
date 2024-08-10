package com.paperunicorn.workhouse.service.executor;

import com.paperunicorn.workhouse.model.workflow.StepAction;

public interface Executor {
    public void execute(StepAction stepAction);
}
