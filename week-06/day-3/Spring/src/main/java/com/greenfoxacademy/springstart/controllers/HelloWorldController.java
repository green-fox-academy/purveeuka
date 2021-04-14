package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.GreetingInt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @RequestMapping("/web/greetingInt")
    public String greetInt(Model model, @RequestParam String color, @RequestParam int fontSize) {
        GreetingInt greetingInt = new GreetingInt(fontSize,color);
        model.addAttribute("greetingInt", greetingInt);
        return "greetingInt";
    }
}
