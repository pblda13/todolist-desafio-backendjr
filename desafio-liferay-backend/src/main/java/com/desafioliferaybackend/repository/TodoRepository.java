package com.desafioliferaybackend.repository;

import com.desafioliferaybackend.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {
}
