package com.samaraaae.ToDoList.services;

import com.samaraaae.ToDoList.dto.ToDoDTO;
import com.samaraaae.ToDoList.entities.ToDo;
import com.samaraaae.ToDoList.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    @Transactional(readOnly = true)
    public List<ToDoDTO> allTask(){
        List<ToDo> result = toDoRepository.findAll();
        List <ToDoDTO> dto = result.stream().map(x -> new ToDoDTO(x)).toList();

        return dto;
    }


}
