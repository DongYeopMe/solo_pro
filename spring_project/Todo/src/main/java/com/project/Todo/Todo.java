package com.project.Todo;


import com.project.Todo.dto.TodosPostDto;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String title;
    private int todoOrder;
    @Column(nullable = false)
    private boolean completed;

    //private Todo() {//생성자 막기 (of만 쓰기 위한용)
    //}

    public static Todo of(TodosPostDto todosPostDto){
        Todo todo = new Todo();
        todo.setTitle(todosPostDto.getTitle());
        todo.setTodoOrder(todosPostDto.getTodoOrder());
        todo.setCompleted(todosPostDto.isCompleted());

        return todo;
    }
}
