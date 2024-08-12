package com.paperunicorn.workhouse.model.workflow;

import com.paperunicorn.workhouse.model.executor.StepConfiguration;
import lombok.Data;

@Data //delete??
public class WrappedStep {
    private StepAction stepAction;
}
