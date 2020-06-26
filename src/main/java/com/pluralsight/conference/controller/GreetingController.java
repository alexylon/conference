package com.pluralsight.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {
    @RequestMapping("greeting")
    public String welcome(Model model) {
        model.addAttribute("greeting", "Welcome!");
        model.addAttribute("tagline", "The one and only amazing website");
        return "greeting";
    }
}