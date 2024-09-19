package com.learn.springboot.dependencyinjectionexample.controller;

import org.springframework.stereotype.*;

@Controller
public class MyController {
   public String sayHello() {
       System.out.println("sayHello");
       return "Hello World!";
   }
}
