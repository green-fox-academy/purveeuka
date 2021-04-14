package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRestController {

    private final AtomicLong greetCount;

    public HelloRestController() {
        greetCount = new AtomicLong(0);

    }

    @RequestMapping(value = "/greeting")
    public Greeting greeting(@RequestParam String name) {
        return new Greeting(greetCount.incrementAndGet(),"Hello, " + name + "!");
    }
}
