package com.example.taskmanageradvanced.repositories;

import com.example.taskmanageradvanced.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TasksRepository extends JpaRepository<TaskEntity,Integer> {

    //Example of writing a custom query -> Ideally this should be present in here
    //rather inside service layer as this can be considered as a business logic
    @Query("SELECT t FROM tasks t WHERE t.completed=false")
    List<TaskEntity> findAllIncompleteTasks();
}
