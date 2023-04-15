package com.project.practice.todos.domain;


import com.project.practice.todos.domain.auditing.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "todo")
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Todo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "todo_id", nullable = false)
    private Long todo_Id;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "is_Completed", nullable = false)
    private String is_Completed;

}
