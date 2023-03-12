package com.example.taskmanageradvanced.repositories;

import com.example.taskmanageradvanced.entities.TaskEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class TasksRepositoryTest {
    @Autowired
    TasksRepository tasksRepository;

    @Test
    public void testCreateTask(){
        TaskEntity task=new TaskEntity();
        task.setTitle("Test Title");
        task.setCompleted(true);
        var savedTask=tasksRepository.save(task);
        assertNotNull(savedTask);
    }
}
