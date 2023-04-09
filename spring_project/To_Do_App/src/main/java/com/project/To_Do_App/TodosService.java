package com.project.To_Do_App;

import com.project.To_Do_App.dto.TodosPatchDto;
import com.project.To_Do_App.dto.TodosPostDto;
import com.project.To_Do_App.dto.TodosResponseDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodosService {
    private final TodosRespository todosRespository;

    public TodosService(TodosRespository todosRespository) {
        this.todosRespository = todosRespository;
    }

    public TodosResponseDto createTodo(TodosPostDto todosPostDto){
        Todo todo =Todo.of(todosPostDto);//엔티티 클래스로 바꿈

        todosRespository.save(todo);//저장하고

        return TodosResponseDto.of(todo);//다시 ResponseDto로 바꾸고 리턴
    }
    public TodosResponseDto findTodo(Long todoId){

        Todo todo = todosRespository.findById(todoId).orElseThrow(IllegalArgumentException::new);
        //IllegalArgumentException 잘못된 값을 줬다 그래서 던져버린다잉
        return TodosResponseDto.of(todo);
    }
    public List<TodosResponseDto> findTodos(){
        List<Todo> todolist = todosRespository.findAll();
        List<TodosResponseDto> todosResponseDtolist = new ArrayList<>();
        //for (int i = 0; i < todolist.size(); i++) {
          //  todosResponseDtolist.add(TodosResponseDto.of(todolist.get(i)));
        //}

        todosResponseDtolist = todolist.stream()
                .map(todo -> TodosResponseDto.of(todo))
                .collect(Collectors.toList());

        return todosResponseDtolist;
    }
    public TodosResponseDto updateTodo(Long todoId,TodosPatchDto todosPatchDto){
        Todo todo = todosRespository.findById(todoId).orElseThrow(IllegalArgumentException::new);
        todo.setTitle(todosPatchDto.getTitle());
        todo.setTodoOrder(todosPatchDto.getTodoOrder());
        todo.setCompleted(todosPatchDto.isCompleted());
        todosRespository.save(todo);
        return TodosResponseDto.of(todo);
    }
    public void deleteTodos(){
        todosRespository.deleteAll();
    }
    public void deleteTodo(Long todoId){
        todosRespository.deleteById(todoId);
    }

}
