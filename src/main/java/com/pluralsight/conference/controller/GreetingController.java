package com.pluralsight.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String greeting(Map<String, Object> model) {
        model.put("message1", "Hello Alex!");
        model.put("message2", "What's up?");
        return "greeting";
    }

    public int number() {
        return 12 * 12;
    }
}
