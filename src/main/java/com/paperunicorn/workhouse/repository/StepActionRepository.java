package com.paperunicorn.workhouse.repository;

import com.paperunicorn.workhouse.model.workflow.StepAction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StepActionRepository extends MongoRepository<StepAction, String> {
}
