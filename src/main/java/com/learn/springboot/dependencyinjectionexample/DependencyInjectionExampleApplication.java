package com.learn.springboot.dependencyinjectionexample;

import com.learn.springboot.dependencyinjectionexample.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.*;

@SpringBootApplication
public class DependencyInjectionExampleApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionExampleApplication.class, args);

        //MyController myController = ctx.getBean(MyController.class);

        //MyController myController = ctx.getBean("myController", MyController.class);

        //Get the bean from the bean Factory created by the
        MyController myController = (MyController) ctx.getBean("myController"); //Here we are asking the contect for the controller(by default Spring created bean name starts with lower case letter and same as class name.)
        System.out.println(myController.sayHello());
    }

}
