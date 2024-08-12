package com.paperunicorn.workhouse.repository;

import com.paperunicorn.workhouse.model.executor.StepConfiguration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StepConfigurationRepository extends MongoRepository<StepConfiguration, String> {
    public Optional<StepConfiguration> findByStepActionId(String stepActionId);
}
