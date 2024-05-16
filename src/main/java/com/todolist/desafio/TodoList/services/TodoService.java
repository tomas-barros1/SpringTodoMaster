package com.todolist.desafio.TodoList.services;

import com.todolist.desafio.TodoList.entities.Todo;
import com.todolist.desafio.TodoList.repositories.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Todo addTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public List<Todo> listTodos() {
        return todoRepository.findAll();
    }

    public Todo editTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public void deleteTodo(Integer id) {
        todoRepository.deleteById(id);
    }

}