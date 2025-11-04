package com.example.multiarchitectureapp.service;

import com.example.multiarchitectureapp.model.GreetingResponse;
import com.example.multiarchitectureapp.repository.GreetingRepository;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingResponse getGreeting() {
        return new GreetingResponse(greetingRepository.fetchGreeting());
    }
}
