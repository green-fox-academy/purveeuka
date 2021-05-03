package com.greenfox.backendapi.services;
import com.greenfox.backendapi.models.Log;
import com.greenfox.backendapi.repositories.LogRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class LogService {

    private final LogRepository logRepository;

    @Autowired
    public LogService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public void log(String endpoint, String query) {
        logRepository.save(new Log(endpoint, query));
    }

    public ResponseEntity<?> getLog(int page, int count, String query) {
        Pageable pageable = PageRequest.of(page - 1, count);
        String result = "";
        ObjectMapper mapper = new ObjectMapper();
        List<Log> logs = logRepository.searchDataContains(query, pageable);
        HashMap<String, Object> results = new HashMap<>();
        results.put("entries", logs);
        results.put("entry_count", logs.size());
        try {
            result = mapper.writeValueAsString(results);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok(result);
    }
}
