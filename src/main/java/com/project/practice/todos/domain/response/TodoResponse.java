package com.project.practice.todos.domain.response;


import com.project.practice.todos.domain.Todo;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

public record TodoResponse(Long todo_Id, String content, String isCompleted, LocalDateTime created_At, LocalDateTime updated_At) {

    public static TodoResponse toDto(Todo todo) {
        return new TodoResponse(todo.getTodo_Id(), todo.getContent(), todo.getIs_Completed(), todo.getCreated_At(), todo.getUpdated_At());
    }
}
