package com.example.greenfoxclassapp.services;

import com.example.greenfoxclassapp.services.interfaces.StudentServiceInterface;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentServiceInterface {

    private List<String> names;

    public StudentServiceImpl() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }


    @Override
    public List<String> findAll() {
        return names;
    }

    @Override
    public void save(String student) {
        names.add(student);

    }

    @Override
    public long count() {
        return names.size();
    }
}
