package com.learn.springboot.profileexample;

import com.learn.springboot.profileexample.controller.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.*;


@SpringBootApplication
public class ProfileExample {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ProfileExample.class, args);

        // Get the I18nController bean from the Spring ApplicationContext
        //I18nController i18nController = (I18nController) context.getBean("i18nController");

        I18nController i18nController = context.getBean(I18nController.class);

        System.out.println(i18nController.getGreeting());
    }
}

