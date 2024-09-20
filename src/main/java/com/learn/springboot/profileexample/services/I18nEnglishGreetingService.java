package com.learn.springboot.profileexample.services;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

@Profile("EN")
@Service("i18nService") //so now spring managed bean reference name would be "i18nService"
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String greet() {
        return "Hello-EN";
    }
}
