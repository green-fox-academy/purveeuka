package com.example.databaseintegration.controllers;
import com.example.databaseintegration.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {
    private final TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value = {"/", "/list"})
    //@ResponseBody
    public String list(Model model) {
        //return "This is my first todoList"
       model.addAttribute("todos", todoRepository.findAll());
        return "todoList";
    }
}
