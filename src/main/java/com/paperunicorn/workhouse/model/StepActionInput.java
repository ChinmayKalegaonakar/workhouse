package com.paperunicorn.workhouse.model;

import lombok.Data;

@Data
public class StepActionInput {
    private String key;
    private Object value;
    private StepActionType type;
}
