package com.learn.springboot.dependencyinjectionexample.controller;

import com.learn.springboot.dependencyinjectionexample.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Controller
public class PropertyInjectedController {

    @Autowired   //@Autowire could only possible only when 'GreetingServices' type found in the ApplicationContext and should be found only when we have declared that with spring managed component using @Component, @Controller, @Service, @Repository annotations on GreetingServices implementations like GreetingServicesImpl .
    public GreetingServices greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}