package com.greenfox.backendapi.repositories;
import com.greenfox.backendapi.models.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class LogRepositoryImpl implements LogRepository {

    private final LogRepositoryMySQL logRepositoryMySQL;

    @Autowired
    public LogRepositoryImpl(LogRepositoryMySQL logRepositoryMySQL) {
        this.logRepositoryMySQL = logRepositoryMySQL;
    }

    @Override
    public List<Log> getAll(Pageable pageable) {
        return (List<Log>) logRepositoryMySQL.findAll(pageable);
    }

    @Override
    public void save(Log log) {
        logRepositoryMySQL.save(log);

    }

    @Override
    public List<Log> searchDataContains(String query, Pageable pageable) {
        return logRepositoryMySQL.findDataContains(query, pageable);
    }
}