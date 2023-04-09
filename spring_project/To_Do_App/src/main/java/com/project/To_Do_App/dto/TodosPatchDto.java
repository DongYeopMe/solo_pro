package com.project.To_Do_App.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TodosPatchDto {
    private long id;
    private String title;
    private int todoOrder;
    private boolean completed;
}
