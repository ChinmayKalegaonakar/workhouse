package com.paperunicorn.workhouse.service;

import com.paperunicorn.workhouse.model.workflow.Workflow;
import com.paperunicorn.workhouse.model.workflow.WorkflowStep;
import com.paperunicorn.workhouse.repository.WorkflowRepository;
import com.paperunicorn.workhouse.repository.WorkflowStepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkflowService {

    @Autowired
    private WorkflowRepository workflowRepository;

    @Autowired
    private WorkflowStepRepository workflowStepRepository;

    public Workflow save(Workflow workflow){
        for(WorkflowStep step: workflow.getSteps()){
            workflowStepRepository.save(step);
        }
        return workflowRepository.save(workflow);
    }
}
