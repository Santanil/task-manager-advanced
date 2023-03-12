package com.example.taskmanageradvanced.repositories;

import com.example.taskmanageradvanced.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksRepository extends JpaRepository<TaskEntity,Integer> {
}
