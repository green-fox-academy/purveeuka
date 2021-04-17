package com.example.bankofsimba.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TextController {
    @GetMapping("/text")
    public String fancySentence(Model model) {
        String sentence = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("sentence", sentence);
        return "text";
    }
}
