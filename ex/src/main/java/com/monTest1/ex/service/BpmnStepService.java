package com.monTest1.ex.service;

import com.monTest1.ex.entity.BpmnStep;
import com.monTest1.ex.repository.BpmnStepRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BpmnStepService {
    private final BpmnStepRepository bpmnStepRepository;

    public BpmnStepService(BpmnStepRepository bpmnStepRepository) {
        this.bpmnStepRepository = bpmnStepRepository;
    }
    public BpmnStep saveBpmnStep(BpmnStep bpmnStep) {
        return bpmnStepRepository.save(bpmnStep);
    }

    // Méthode pour récupérer tous les BpmnStep de la base de données
    public List<BpmnStep> getAllBpmnSteps() {
        return bpmnStepRepository.findAll();
    }
}
