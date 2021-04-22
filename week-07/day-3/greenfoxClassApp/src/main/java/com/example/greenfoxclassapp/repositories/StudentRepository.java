package com.example.greenfoxclassapp.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private List<String> studentNames;

    public StudentRepository(){
        this.studentNames = new ArrayList<>();
        studentNames = readFile();
    }

    public List<String> readFile() {
        Path path = Path.of("src/main/java/com/example/greenfoxclassapp/studentNames.txt");
        List<String> fileContent = new ArrayList<>();
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("Cannot open the file");
        }
        return fileContent;
    }

    public void writeFile(List<String> studentNames) {
        Path path = Path.of("src/main/java/com/example/greenfoxclassapp/studentNames.txt");
        try {
            Files.write(path, studentNames);
        } catch (IOException e) {
            System.out.println("Could not write into the file.");
        }
    }
}
