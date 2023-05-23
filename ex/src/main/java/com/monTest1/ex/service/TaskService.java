package com.monTest1.ex.service;

import com.monTest1.ex.DTO.CountType;
import com.monTest1.ex.entity.Task;
import com.monTest1.ex.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class TaskService {
    private final TaskRepository taskRepository;
    public List<Task> getTasks()
    {
        return taskRepository.getAllTaskByDueDate();
    }
    public Optional<Task> getTaskById(Long id){
        return taskRepository.findById(id);
    }
    public Task save(Task task){
        return taskRepository.saveAndFlush(task);
    }

    public boolean existsById(Long id) {
        return taskRepository.existsById(id);
    }
    public void deteleTask(Long id){
        taskRepository.deleteById(id);
    }
    public List<CountType> getPercentageGroupByType()
    {
        return taskRepository.getPercentageGroupByType();
    }

}
