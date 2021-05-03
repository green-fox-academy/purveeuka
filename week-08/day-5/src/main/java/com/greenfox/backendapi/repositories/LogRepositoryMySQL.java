package com.greenfox.backendapi.repositories;

import com.greenfox.backendapi.models.Log;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LogRepositoryMySQL extends JpaRepository<Log, Long> {
    Page<Log> findAll(Pageable pageable);

    @Query(value = "SELECT * " + "FROM log " + "WHERE data LIKE %:query%", nativeQuery = true)
    List<Log> findDataContains(String query, Pageable pageable);
}
