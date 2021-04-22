package com.example.greenfoxclassapp.services.interfaces;

import java.util.List;

public interface StudentServiceInterface  {
    List<String> findAll();
    void save(String student);
    long count();
}
