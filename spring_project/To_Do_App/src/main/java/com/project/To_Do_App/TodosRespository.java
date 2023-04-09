package com.project.To_Do_App;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodosRespository extends JpaRepository<Todo,Long> {
}
