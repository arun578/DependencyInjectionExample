package com.learn.springboot.dependencyinjectionexample.controller;

import com.learn.springboot.dependencyinjectionexample.services.*;
import org.springframework.stereotype.*;

@Controller
public class ConstructorInjectedConstructor {

    GreetingServices greetingServices;
    //@Autowired  //Optional in ConstructorInjection
    public ConstructorInjectedConstructor(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public String getGreeting() {
        return greetingServices.sayGreeting();
    }
}
