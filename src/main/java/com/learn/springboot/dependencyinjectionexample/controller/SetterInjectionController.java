package com.learn.springboot.dependencyinjectionexample.controller;

import com.learn.springboot.dependencyinjectionexample.services.*;

public class SetterInjectionController {

    private GreetingServices greetingServices;

    public void setGreetingServices(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreeting() {
        return greetingServices.sayGreeting();
    }
}
