package com.paperunicorn.workhouse.controller;


import com.paperunicorn.workhouse.model.Workflow;
import com.paperunicorn.workhouse.repository.WorkflowRepository;
import com.paperunicorn.workhouse.service.WorkflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workflow")
public class WorkflowController {

    @Autowired
    private WorkflowRepository workflowRepository;

    @Autowired
    private WorkflowService workflowService;

    @GetMapping("")
    public List<Workflow> getAllWorkflows(){
        return workflowRepository.findAll();
    }

    @PostMapping("")
    public Workflow addWorkflows(@RequestBody Workflow request){
        return workflowService.save(request);
    }
}
