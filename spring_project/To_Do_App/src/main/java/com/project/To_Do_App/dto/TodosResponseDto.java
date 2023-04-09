package com.project.To_Do_App.dto;

import com.project.To_Do_App.Todo;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TodosResponseDto {
    private long Id;
    private String title;
    private int todoOrder;
    private boolean completed;

    public static TodosResponseDto of(Todo todo){
        TodosResponseDto todosResponseDto = new TodosResponseDto();

        todosResponseDto.setId(todo.getId());
        todosResponseDto.setTitle(todo.getTitle());
        todosResponseDto.setTodoOrder(todo.getTodoOrder());
        todosResponseDto.setCompleted(todo.isCompleted());

        return todosResponseDto;
    }
}
