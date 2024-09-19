package com.learn.springboot.dependencyinjectionexample.services;

import org.springframework.stereotype.*;

@Service
public class GreetingServicesImpl implements GreetingServices {

    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}