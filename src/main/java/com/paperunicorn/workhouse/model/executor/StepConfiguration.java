package com.paperunicorn.workhouse.model.executor;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document
public class StepConfiguration {
    @Id
    private String id;

    @Field
    private String stepActionId;

    @Field
    private StepConfigurationType type;
}
