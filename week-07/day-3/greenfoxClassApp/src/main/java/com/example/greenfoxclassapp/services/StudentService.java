package com.example.greenfoxclassapp.services;
import com.example.greenfoxclassapp.services.interfaces.StudentServiceInterface;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements StudentServiceInterface {
    private final List<String> names;

    public StudentService() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    public List<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
    }

    @Override
    public long count() {
        return names.size();
    }
}