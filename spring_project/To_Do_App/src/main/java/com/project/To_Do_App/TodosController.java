package com.project.To_Do_App;

import com.project.To_Do_App.dto.TodosPatchDto;
import com.project.To_Do_App.dto.TodosPostDto;
import com.project.To_Do_App.dto.TodosResponseDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodosController {
    private final TodosService todosService;

    public TodosController(TodosService todosService) {
        this.todosService = todosService;
    }
    @PostMapping
    public ResponseEntity<TodosResponseDto> postTodo(@RequestBody TodosPostDto todosPostDto){
        TodosResponseDto response = todosService.createTodo(todosPostDto);

        return ResponseEntity.ok(response);
    }
    @GetMapping
    public ResponseEntity<List<TodosResponseDto>> getTodos(){
        List<TodosResponseDto> responseDtoList = todosService.findTodos();

        return ResponseEntity.ok(responseDtoList);
    }
    @GetMapping("/{id}")
    public ResponseEntity<TodosResponseDto> getTodo(@PathVariable("id") Long todoId){
        TodosResponseDto response = todosService.findTodo(todoId);

        return ResponseEntity.ok(response);
    }
    @PatchMapping("/{id}")
    public ResponseEntity<TodosResponseDto> patchTodo(@PathVariable("id") Long todoId,
                                                      @RequestBody TodosPatchDto todosPatchDto){

        TodosResponseDto response = todosService.updateTodo(todoId,todosPatchDto);

        return ResponseEntity.ok(response);
    }

    @DeleteMapping
    public ResponseEntity deleteAllTodos(){
        todosService.deleteTodos();
        return new ResponseEntity<>(HttpStatus.RESET_CONTENT);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteTodo(@PathVariable("id") Long todoId){
        todosService.deleteTodo(todoId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
