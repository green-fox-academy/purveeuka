package com.example.mysql_connection.repositories;

import com.example.mysql_connection.models.Assignee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface AssigneeRepository extends JpaRepository<Assignee, Long> {

    List<Assignee> findByName(String searchName);
    Assignee findAssigneeById(Long id);
    @Override
    Optional<Assignee> findById(Long idAssignee);
    @Override
    void deleteById(Long id);
}
