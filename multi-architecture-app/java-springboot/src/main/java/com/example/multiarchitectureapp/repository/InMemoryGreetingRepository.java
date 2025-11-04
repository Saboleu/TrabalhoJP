package com.example.multiarchitectureapp.repository;

import org.springframework.stereotype.Repository;

@Repository
public class InMemoryGreetingRepository implements GreetingRepository {

    @Override
    public String fetchGreeting() {
        return "Hello, World!";
    }
}
