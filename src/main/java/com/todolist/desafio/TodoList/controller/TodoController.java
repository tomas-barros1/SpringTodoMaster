package com.todolist.desafio.TodoList.controller;

import com.todolist.desafio.TodoList.entities.Todo;
import com.todolist.desafio.TodoList.services.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping(value = "/add")
    public ResponseEntity<Todo> addTodo(@RequestBody Todo todo) {
        Todo savedTodo = todoService.addTodo(todo);
        return ResponseEntity.ok(savedTodo);
    }

    @GetMapping(value = "/list")
    public List<Todo> listTodos() {
        return todoService.listTodos();
    }

    @PutMapping(value = "/edit")
    public ResponseEntity<Todo> editTodo(@RequestBody Todo todo) {
        todoService.editTodo(todo);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable Integer id) {
        todoService.deleteTodo(id);
        return ResponseEntity.ok().build();
    }

}