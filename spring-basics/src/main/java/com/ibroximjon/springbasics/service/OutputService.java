package com.ibroximjon.springbasics.service;

import org.springframework.beans.factory.annotation.Autowired;

public class OutputService {


    private final GreetingService greetingService;

    public OutputService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String output() {
        return greetingService.greet();
    }
}
