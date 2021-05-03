package com.greenfox.backendapi.repositories;

import com.greenfox.backendapi.models.Log;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface LogRepository {
    List<Log> getAll(Pageable pageable);

    void save(Log log);

    List<Log> searchDataContains(String query, Pageable pageable);
}