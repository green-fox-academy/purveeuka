package com.example.greenfoxclassapp.services;

import com.example.greenfoxclassapp.repositories.StudentRepository;
import com.example.greenfoxclassapp.services.interfaces.StudentServiceInterface;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class StudentServiceImpl2 implements StudentServiceInterface {

    private StudentRepository studentRepository;

    public StudentServiceImpl2(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<String> findAll() {
        return studentRepository.readFile();
    }

    @Override
    public void save(String student) {
        List<String> students = studentRepository.readFile();
        students.add(student);
        studentRepository.writeFile(students);

    }

    @Override
    public long count() {
        return studentRepository.readFile().size();
    }
}
