package com.project.practice.todos.repository;

import com.project.practice.todos.domain.Todo;
import jakarta.persistence.OrderBy;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

    @Override
    @OrderBy("updated_At")
    List<Todo> findAll();
}
