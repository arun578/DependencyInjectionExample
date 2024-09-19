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

        // --------------------------------Common Dependency Injection Errors------------------------

        System.out.println("--------------------Property injection Testing");
        //1. if we don't define @Controller on top of PropertyInjectedController class, then we got "NoSuchBeanDefinitionException" because spring doesn't know if it is a managed component.

        PropertyInjectedController propertyController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

        //2. But if we don't define @Autowired on top of "public GreetingServices greetingService;" in PropertyInjectedController class then GreetingServices isn't instantiated thus we are getting "nullPointer exception". @Autowired is only Optional for Constructor Injection.
        System.out.println(propertyController.getGreeting());

        System.out.println("--------------------Setter injection Testing");

        //NoSuchBeanDefinitionException" :In same way as above we first need to define class as a spring managed component/Bean by any out of 4 suitable annotation from @Component, @Service, @Repository, and @Controller
        SetterInjectionController setterController = (SetterInjectionController) ctx.getBean("setterInjectionController");
        //NullPointerException: Dependency is not injected means instance could not be created since setterInjection is lazy loading. but if we don't mention @Autowired then dependency could not be injected and reference variable will be pointed to Null thus getting NullPointerException.
        System.out.println(setterController.getGreeting());


        System.out.println("--------------------Constructor injection Testing");

        //For Component Scan any one from @Component, @Service, @Repository, and @Controller is required while in constructor injection @Autowired is optional
        ConstructorInjectedConstructor constructorController = (ConstructorInjectedConstructor) ctx.getBean("constructorInjectedConstructor");
        System.out.println(constructorController.getGreeting());


    }
}
