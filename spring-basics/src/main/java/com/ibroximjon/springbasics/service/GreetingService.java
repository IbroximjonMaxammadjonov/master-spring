package com.ibroximjon.springbasics.service;

public class GreetingService {

    private String greeting;
    public GreetingService(String greeting) {
        this.greeting = greeting;
    }

    public String greet() {
        return "Hello " + greeting + "!";
    }
}
