package com.pluralsight.conference.controller;

import com.pluralsight.conference.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegistrationController {

    private String name;

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration") Registration reg) {
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute("registration") Registration reg,
                                  BindingResult result) {

        if (result.hasErrors()) {
            System.out.println("There were errors");
            return "registration";
        }

        System.out.println("Registration: " + reg.getName());
        this.name = reg.getName();
        // return "registration"; // Resubmits form on page reload
        // return "redirect:registration"; // Does not resubmit form on page reload
        return "redirect:confirmation";
    }

    @GetMapping("confirmation")
    public String getConfirmation(Model model) {
        model.addAttribute("name", this.name);
        return "confirmation";
    }
}
