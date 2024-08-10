package com.paperunicorn.workhouse.model.workflow;

import com.paperunicorn.workhouse.model.executor.StepExecutor;
import lombok.Data;

@Data
public class WrappedStep {
    private StepAction stepAction;
    private StepExecutor stepExecutor;
}
