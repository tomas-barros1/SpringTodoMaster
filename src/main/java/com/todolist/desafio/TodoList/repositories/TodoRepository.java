package com.todolist.desafio.TodoList.repositories;

import com.todolist.desafio.TodoList.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
}
