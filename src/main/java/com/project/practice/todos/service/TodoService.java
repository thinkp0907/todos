package com.project.practice.todos.service;


import com.project.practice.todos.domain.Todo;
import com.project.practice.todos.domain.response.TodoResponse;
import com.project.practice.todos.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public List<TodoResponse> getTodos() {
        return todoRepository.findAll()
                .stream()
                .map(TodoResponse::toDto)
                .toList();
    }

    public List<TodoResponse> saveTodos(Todo todo) {
        Todo td = Todo.builder()
                .content(todo.getContent())
                .is_Completed("N")
                .todo_Id(todo.getTodo_Id())
                .build();

        todoRepository.save(td);
        return this.getTodos();
    }

    public List<TodoResponse> deleteTodos(Todo todo) {
        todoRepository.deleteById(todo.getTodo_Id());
        return this.getTodos();
    }


}
