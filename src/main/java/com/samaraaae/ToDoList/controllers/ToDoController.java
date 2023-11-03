package com.samaraaae.ToDoList.controllers;

import com.samaraaae.ToDoList.dto.ToDoDTO;
import com.samaraaae.ToDoList.entities.ToDo;
import com.samaraaae.ToDoList.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tasks")
public class ToDoController {
    @Autowired
    private ToDoService toDoService;

    @GetMapping
    public List<ToDoDTO> allTask(){
        List<ToDoDTO> result = toDoService.allTask();
        return result;
    }

    @PostMapping
    public ToDo addTask(@RequestBody ToDo toDo){
        return toDoService.addTask(toDo);
    }

}
