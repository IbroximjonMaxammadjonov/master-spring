package com.ibroximjon.springbasics.config;

import com.ibroximjon.springbasics.service.GreetingService;
import com.ibroximjon.springbasics.service.OutputService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Value("${greeting}")
    private String greeting;

    @Bean
    public GreetingService greetingService() {
        return new GreetingService(greeting);
    }

    @Bean
    public OutputService outputService(GreetingService greetingService) {
        return new OutputService(greetingService);
    }
}
