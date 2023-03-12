package com.example.taskmanageradvanced.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity(name="tasks")
@Getter
@Setter
public class TaskEntity extends BaseEntity {

    @Column(name="title", nullable = false, length = 150)
    String title;

    @Column(name="completed", nullable = false, columnDefinition = "boolean default false")
    Boolean completed;

    @Column(name="due_date",columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    Date dueDate;

    //We should write following lines if we want to fetch all the notes when a task is fetched
    //@OneToMany(mappedBy = "tasks",fetch=FetchType.EAGER)
    //List<NoteEntity> notes;
}
