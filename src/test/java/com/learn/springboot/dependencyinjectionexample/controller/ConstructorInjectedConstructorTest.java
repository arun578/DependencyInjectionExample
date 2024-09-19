package com.learn.springboot.dependencyinjectionexample.controller;

import com.learn.springboot.dependencyinjectionexample.services.*;
import org.junit.jupiter.api.*;

class ConstructorInjectedConstructorTest {

    ConstructorInjectedConstructor constructorInjectedConstructor;

    @BeforeEach
    void setUp() {
        constructorInjectedConstructor = new ConstructorInjectedConstructor(new GreetingServicesImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectedConstructor.getGreeting());
    }
}