package com.todolist.desafio.TodoList.exceptions;

public class TodoNotFoundException extends Exception{

    public TodoNotFoundException() {
        super("Todo not found");
    }

}
