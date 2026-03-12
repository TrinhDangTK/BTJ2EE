package com.example.demo.controller;

import com.example.demo.model.student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/demo")
    public String demoPage(Model model) {
      
        student student = new student(1, "Nguyễn Văn A");

        model.addAttribute("student", student);
        model.addAttribute("message", "Welcome Thymeleaf!");

        return "demo"; 
    }
}
