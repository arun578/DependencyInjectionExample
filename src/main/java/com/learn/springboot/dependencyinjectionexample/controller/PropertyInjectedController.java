package com.learn.springboot.dependencyinjectionexample.controller;

import com.learn.springboot.dependencyinjectionexample.services.*;

public class PropertyInjectedController {

    public GreetingServices greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}