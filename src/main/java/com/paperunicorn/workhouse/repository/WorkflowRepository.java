package com.paperunicorn.workhouse.repository;

import com.paperunicorn.workhouse.model.Workflow;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkflowRepository extends MongoRepository<Workflow, String> {
}
