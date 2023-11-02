package com.samaraaae.ToDoList.repositories;

import com.samaraaae.ToDoList.entities.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
