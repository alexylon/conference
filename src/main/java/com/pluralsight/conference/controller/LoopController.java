package com.pluralsight.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class LoopController {
    @GetMapping("loop")
    public String Loop(Map<String, Object> model) {
        int number = 0;

        for(int i = 1; i <= 10; i++) {
            number = number + i;
        }

        model.put("number", number);

        return "loop";
    }
}
