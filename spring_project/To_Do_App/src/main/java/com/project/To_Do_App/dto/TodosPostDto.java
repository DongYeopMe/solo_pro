package com.project.To_Do_App.dto;


import lombok.Getter;

@Getter
public class TodosPostDto {
    private String title;
    private int todoOrder;
    private boolean completed;
}
