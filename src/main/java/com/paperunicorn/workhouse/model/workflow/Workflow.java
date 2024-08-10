package com.paperunicorn.workhouse.model.workflow;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document
public class Workflow {
    @Id
    private String id;

    @Field
    private String name;

    @Field
    private String product;

    @Field
    private String description;

    @DBRef
    private List<WorkflowStep> steps;
}
