package com.pluralsight.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CountController {
    @GetMapping("count")
    public String count() {

        return "count";
    }
}
