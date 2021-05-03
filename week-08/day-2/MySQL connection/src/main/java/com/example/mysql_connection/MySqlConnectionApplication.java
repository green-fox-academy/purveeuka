package com.example.mysql_connection;

import com.example.mysql_connection.models.Assignee;
import com.example.mysql_connection.models.Todo;
import com.example.mysql_connection.repositories.AssigneeRepository;
import com.example.mysql_connection.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySqlConnectionApplication implements CommandLineRunner {

    private final TodoRepository todoRepository;
    private final AssigneeRepository assigneeRepository;

    @Autowired
    public MySqlConnectionApplication(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(MySqlConnectionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("Create todo class"));
        todoRepository.save(new Todo("Create todo repo"));
        todoRepository.save(new Todo("connect app with MySQL"));
        todoRepository.save(new Todo("Extend list"));
        todoRepository.save(new Todo("finish the exercises"));
        assigneeRepository.save(new Assignee("Rachel","rachel@gmail.com"));
        assigneeRepository.save(new Assignee("Ross","rss@gmail.com"));
        assigneeRepository.save(new Assignee("Monica","mon@gmail.com"));
        assigneeRepository.save(new Assignee("Chandler","chan@gmail.com"));
    }
}
