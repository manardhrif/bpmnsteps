package com.monTest1.ex.repository;

import com.monTest1.ex.DTO.CountType;
import com.monTest1.ex.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long>
{
//nativeQuery tetaamel maa les noms de stables bd
//la requette permet de selectioner les donnees ordonné par la date
    @Query(value = "select * from task order by due_date desc", nativeQuery = true)
    public List<Task> getAllTaskByDueDate();
//JPA query
    @Query(value = "select new com.monTest1.ex.DTO.CountType(COUNT(*)/(SELECT COUNT(*) FROM Task) * 100, type) from Task GROUP BY type")
    public List<CountType> getPercentageGroupByType();

}
