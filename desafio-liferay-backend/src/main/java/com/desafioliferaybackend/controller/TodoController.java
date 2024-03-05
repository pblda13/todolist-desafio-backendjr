package com.desafioliferaybackend.controller;

import com.desafioliferaybackend.entity.Todo;
import com.desafioliferaybackend.service.TodoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    private TodoService todoService;

    List<Todo>create(Todo todo){
        return todoService.create(todo);
    }
    List<Todo>list(Todo todo){
        return todoService.list();
    }
    List<Todo>update(Todo todo){
        return todoService.update(todo);
    }
    List<Todo>delete(Long id){
        return todoService.delete(id);
    }
}
