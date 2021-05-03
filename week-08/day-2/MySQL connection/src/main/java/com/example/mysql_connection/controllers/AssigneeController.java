package com.example.mysql_connection.controllers;

import com.example.mysql_connection.models.Assignee;
import com.example.mysql_connection.repositories.AssigneeRepository;
import com.example.mysql_connection.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {

    private final AssigneeRepository assigneeRepository;
    private final TodoRepository todoRepository;

    @Autowired
    public AssigneeController(AssigneeRepository assigneeRepository, TodoRepository todoRepository) {
        this.assigneeRepository = assigneeRepository;
        this.todoRepository = todoRepository;
    }

    @RequestMapping({"", "/list"})
    public String listAssignees(Model model) {
        model.addAttribute("assignees", assigneeRepository.findAll());
        return "assigneeList";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("assignee", assigneeRepository.findAssigneeById(id));
        return "editAssignee";
    }

    @PostMapping("/{id}/edit")
    public String saveAssignee(@ModelAttribute Assignee assignee) {
        assigneeRepository.save(assignee);
        return "redirect:/assignee";
    }

    @GetMapping("/{id}/delete")
    public String deleteAssignee(@PathVariable Long id) {
        assigneeRepository.deleteById(id);
        return "redirect:/assignee";
    }

    @GetMapping("/addAssignee")
    public String addAssignee() {
        return "addAssignee";
    }

    @PostMapping("/addAssignee")
    public String addAssigneePost(@ModelAttribute Assignee assignee) {
        assigneeRepository.save(assignee);
        return "redirect:/assignee";
    }

    @GetMapping("/{id}/assignedTodos")
    public String showTodos(@PathVariable Long id, Model model) {
        model.addAttribute("todos", todoRepository.findByAssignee(assigneeRepository.findById(id).orElse(null)));
        return "assignedTodos";
    }
}