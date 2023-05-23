package com.monTest1.ex.controller;
import com.monTest1.ex.entity.BpmnStep;
import com.monTest1.ex.repository.BpmnStepRepository;
import com.monTest1.ex.service.BpmnStepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BpmnStepController {
    @Autowired
    private BpmnStepService bpmnStepService;

    // Point de terminaison pour enregistrer un BpmnStep
    @PostMapping("/bpmnsteps")
    public BpmnStep saveBpmnStep(@RequestBody BpmnStep bpmnStep) {
        return bpmnStepService.saveBpmnStep(bpmnStep);
    }

    // Point de terminaison pour récupérer tous les BpmnStep
    @GetMapping("/bpmnsteps")
    public List<BpmnStep> getAllBpmnSteps() {
        return bpmnStepService.getAllBpmnSteps();
    }
}