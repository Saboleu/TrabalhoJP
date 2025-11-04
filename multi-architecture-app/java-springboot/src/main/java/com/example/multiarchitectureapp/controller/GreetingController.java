package com.example.multiarchitectureapp.controller;

import com.example.multiarchitectureapp.model.GreetingResponse;
import com.example.multiarchitectureapp.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping
    public GreetingResponse sayHello() {
        return greetingService.getGreeting();
    }
}
