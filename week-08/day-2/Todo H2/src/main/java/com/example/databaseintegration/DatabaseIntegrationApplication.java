package com.example.databaseintegration;

import com.example.databaseintegration.models.Todo;
import com.example.databaseintegration.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseIntegrationApplication  implements CommandLineRunner {

    private final TodoRepository todoRepository;

    @Autowired
    public DatabaseIntegrationApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(DatabaseIntegrationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
        todoRepository.save(new Todo("inject repository"));
        todoRepository.save(new Todo("prepare for the lightening talk"));
        todoRepository.save(new Todo("watch videos for tomorrow"));
    }
}
