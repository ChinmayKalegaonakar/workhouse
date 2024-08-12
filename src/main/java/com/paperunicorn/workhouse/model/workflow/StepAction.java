package com.paperunicorn.workhouse.model.workflow;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class StepAction {
    @Id
    private String id;

    private String name;
    private List<StepActionInput> inputs;
    private int order;
    private boolean mandatory;
}
