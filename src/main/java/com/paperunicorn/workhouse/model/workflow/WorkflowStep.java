package com.paperunicorn.workhouse.model.workflow;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document
public class WorkflowStep {

    @Id
    private String id;

    @Field
    private String name;

    @Field
    private List<StepAction> stepActions;

}
