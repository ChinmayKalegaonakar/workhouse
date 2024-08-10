package com.paperunicorn.workhouse.repository;

import com.paperunicorn.workhouse.model.workflow.WorkflowStep;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkflowStepRepository extends MongoRepository<WorkflowStep, String> {
}
