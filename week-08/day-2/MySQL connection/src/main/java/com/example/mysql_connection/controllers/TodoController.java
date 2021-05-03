package com.example.mysql_connection.controllers;
import com.example.mysql_connection.models.Todo;
import com.example.mysql_connection.repositories.AssigneeRepository;
import com.example.mysql_connection.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {
    private final TodoRepository todoRepository;
    private final AssigneeRepository assigneeRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
    }
    @GetMapping(value = {"/", "/listAll"})
    public String list(Model model) {
        model.addAttribute("todos", todoRepository.findAll());

        return "todoList";
    }

    @GetMapping(value = {"/", "/list", "/{isActive}"})
    public String listActive(Model model, @RequestParam(required = false) String isActive) {
        List<Todo> filteredTasks = new ArrayList<>();
        if (isActive.equals("")) {
            filteredTasks.addAll(todoRepository.findAll());
        } else {
            todoRepository.findAll().forEach(item -> {
                if (item.isDone() != Boolean.parseBoolean(isActive)) {
                    filteredTasks.add(item);
                }
            });
        }
        model.addAttribute("todos", filteredTasks);

        return "todoList";
    }

    @GetMapping("/add")
    public String addTask(Model model){
        model.addAttribute("todo", new Todo());
        return "addTask";
    }

    @PostMapping("/add")
    public String saveTask(@ModelAttribute Todo todo, @RequestParam String dueDate) {
        try {
            Date newdueDate = new SimpleDateFormat("yyyy-MM-dd").parse(dueDate);
        } catch (ParseException e) {
            e.printStackTrace();
            return "redirect:/todo/listAll";
        }
        todoRepository.save(todo);
        return "redirect:/todo/listAll";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        todoRepository.deleteById(id);
        return "redirect:/todo/listAll";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable long id, Model model) {
        model.addAttribute("todo", todoRepository.findTodoById(id));
        model.addAttribute("assignees", assigneeRepository.findAll());
        return "editTask";

    }

    @PostMapping("/{id}/edit")
    public String update(@ModelAttribute Todo todo,
                         @PathVariable long id,
                         @RequestParam Long assigneeId,
                         @RequestParam String dueDate) {
        try {
            Date newdueDate = new SimpleDateFormat("yyyy-MM-dd").parse(dueDate);
        } catch (ParseException e) {
            e.printStackTrace();
            return "redirect:/todo/listAll";
        }
        todo.setAssignee((assigneeRepository.findById(assigneeId).orElse(null)));
        todoRepository.save(todo);
        return "redirect:/todo/listAll";
    }

    @PostMapping("/search")
    public String search(@RequestParam String title, Model model) {
        model.addAttribute("todos", todoRepository.findByTitle(title));
        return "todoList";
    }
}
