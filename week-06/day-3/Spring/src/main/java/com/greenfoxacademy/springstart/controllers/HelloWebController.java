package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    private final AtomicLong loadCount;

    public HelloWebController() {
        loadCount = new AtomicLong(1);
    }

    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam String name) {
        Greeting greeting = new Greeting(loadCount.incrementAndGet(), name);
        model.addAttribute("greeting", greeting);
        return "greeting";
    }
}
