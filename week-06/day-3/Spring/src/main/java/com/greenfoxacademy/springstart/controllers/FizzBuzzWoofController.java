package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.models.FizzBuzzWoof;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class FizzBuzzWoofController {
    private final AtomicLong loadCount;

    public FizzBuzzWoofController() {
        this.loadCount = new AtomicLong(0);
    }

    @GetMapping("/fizz-buzz-woof")
    public String guess(Model model) {
        FizzBuzzWoof fizzBuzzFoo = new FizzBuzzWoof(this.loadCount.incrementAndGet());
        model.addAttribute( "fizzBuzzFoo", fizzBuzzFoo);
        return "FizzBuzzWoof";
    }
}
