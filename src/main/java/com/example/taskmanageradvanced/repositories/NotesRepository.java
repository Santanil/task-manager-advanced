package com.example.taskmanageradvanced.repositories;

import com.example.taskmanageradvanced.entities.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends JpaRepository<NoteEntity,Integer> {
}
