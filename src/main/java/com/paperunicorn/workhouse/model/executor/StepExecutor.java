package com.paperunicorn.workhouse.model.executor;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class StepExecutor {
    private StepExecutorType type;
}
