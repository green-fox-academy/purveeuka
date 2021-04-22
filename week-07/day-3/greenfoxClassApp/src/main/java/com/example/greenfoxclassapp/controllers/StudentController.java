package com.example.greenfoxclassapp.controllers;
import com.example.greenfoxclassapp.services.StudentServiceImpl2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    private StudentServiceImpl2 studentService;

    @Autowired
    public StudentController(StudentServiceImpl2 studentService) {
        this.studentService = studentService;

    }

    @GetMapping("/gfa")
    public String mainPage() {
        return "mainPage";
    }

    @GetMapping("/gfa/list")
    public String listStudents(Model model) {
        model.addAttribute("studentList",studentService.findAll());
        return "list";
    }

    @GetMapping("/gfa/add")
    public String addStudent(Model model) {
        return "addStudent";
    }

    @PostMapping("/gfa/save")
    public String saveName(String name) {
        studentService.save(name);
        return "redirect:/gfa/list";
    }

    @GetMapping("gfa/check")
    public String checkStudent() {
        return "checkList";
    }

    @PostMapping("gfa/check")
    public String check(String name, Model model) {
        String resultYes = name + " is already in the list";
        String resultNo = name + " is not in the list.";
        model.addAttribute("student", name);
        if (studentService.findAll().contains(name)) {
            model.addAttribute("result", resultYes);
        } else {
            model.addAttribute("result",resultNo);
        }
        return "checkList";
    }
}
