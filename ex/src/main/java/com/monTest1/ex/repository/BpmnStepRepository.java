package com.monTest1.ex.repository;

import com.monTest1.ex.entity.BpmnStep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BpmnStepRepository extends JpaRepository<BpmnStep, Long> {
}
