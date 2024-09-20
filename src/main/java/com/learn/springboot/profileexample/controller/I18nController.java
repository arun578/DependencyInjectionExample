package com.learn.springboot.profileexample.controller;

import com.learn.springboot.profileexample.services.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Controller
public class I18nController {
    GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) { //@Qualifier("i18nService") since Annotation-specified bean name 'i18nService' for bean class [com.learn.springboot.profileexample.services.I18nSpanishGreetingService]
        // conflicts with existing, non-compatible bean definition of same name  and class [com.learn.springboot.profileexample.services.I18nEnglishGreetingService]. Both Service Implementation is for same purpose to greet people but for different region
        // that we can achieve using @Profile. That we can activate by setting property in application.properties. So Because we are using @Profile, other beans where profile is not matched will not be loading into the application context. So there is no conflict error
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.greet();
    }
}
