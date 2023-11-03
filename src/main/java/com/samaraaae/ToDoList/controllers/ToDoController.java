package com.samaraaae.ToDoList.controllers;

import com.samaraaae.ToDoList.dto.ToDoDTO;
import com.samaraaae.ToDoList.entities.ToDo;
import com.samaraaae.ToDoList.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tasks")
public class ToDoController {
    @Autowired
    private ToDoService toDoService;

    @GetMapping
    public ResponseEntity<List<ToDoDTO>> allTask(){
        return ResponseEntity.ok(toDoService.allTask());
    }

    @PostMapping
    public ResponseEntity<ToDo> addTask(@RequestBody ToDo toDo){
        ToDo toDo1 = toDoService.addTask(toDo);
        return new ResponseEntity<>(toDo, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<ToDo> updateTask(@RequestBody ToDo toDo){
        return ResponseEntity.ok(toDoService.addTask(toDo));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        toDoService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
