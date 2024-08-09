package com.paperunicorn.workhouse.model;

import lombok.Data;

import java.util.List;

@Data
public class StepAction {
    private String name;
    private List<StepActionInput> inputs;
    private int order;
    private boolean mandatory;
}
