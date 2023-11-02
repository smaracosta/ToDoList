package com.samaraaae.ToDoList.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "tb_todo")
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String taskDescription;
    private Boolean completed;

    public ToDo() {
    }

    public ToDo(Long id, String taskDescription, Boolean completed) {
        this.id = id;
        this.taskDescription = taskDescription;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
