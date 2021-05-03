package com.example.mysql_connection.repositories;
import com.example.mysql_connection.models.Assignee;
import com.example.mysql_connection.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    List<Todo> findByTitle(String searchTitle);
    Todo findTodoById(Long id);
    List<Todo> findByAssignee(Assignee assignee);
    List<Todo> findByTitleOrAssignee(String title, Assignee assignee);
}
