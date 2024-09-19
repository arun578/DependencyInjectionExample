package com.learn.springboot.dependencyinjectionexample.controller;

import com.learn.springboot.dependencyinjectionexample.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Controller
public class SetterInjectionController {

    private GreetingServices greetingServices;

    @Autowired
    public void setGreetingServices(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreeting() {
        return greetingServices.sayGreeting();
    }
}
