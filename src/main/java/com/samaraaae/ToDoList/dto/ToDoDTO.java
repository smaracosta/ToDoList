package com.samaraaae.ToDoList.dto;

import com.samaraaae.ToDoList.entities.ToDo;

public class ToDoDTO {

    private String taskDescription;
    private Boolean completed;

    public ToDoDTO() {
    }

    public ToDoDTO(ToDo entity) {
        this.taskDescription = entity.getTaskDescription();
        this.completed = entity.getCompleted();
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public Boolean getCompleted() {
        return completed;
    }
}