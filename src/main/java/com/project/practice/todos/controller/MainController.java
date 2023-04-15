package com.project.practice.todos.controller;


import com.project.practice.todos.domain.Todo;
import com.project.practice.todos.domain.response.TodoResponse;
import com.project.practice.todos.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.ArrayList;
import java.util.List;

@RestController("/")
@RequiredArgsConstructor
public class MainController {

    private final TodoService todoService;

    @GetMapping("/todos")
    public ResponseEntity<List<TodoResponse>> getTodos() {
        return new ResponseEntity<>(todoService.getTodos(), HttpStatus.OK);
    }

    @PostMapping("/todos")
    public ResponseEntity<List<TodoResponse>> saveTodos(@RequestBody Todo todo) {
        return new ResponseEntity<>(todoService.saveTodos(todo), HttpStatus.OK);
    }

    @DeleteMapping("/todos")
    public ResponseEntity<List<TodoResponse>> deleteTodos(@RequestBody Todo todo) {
        return new ResponseEntity<>(todoService.deleteTodos(todo), HttpStatus.OK);
    }
}
