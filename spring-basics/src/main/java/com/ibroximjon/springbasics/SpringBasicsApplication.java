package com.ibroximjon.springbasics;


import com.ibroximjon.springbasics.config.AppConfig;
import com.ibroximjon.springbasics.service.OutputService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBasicsApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OutputService outputService = context.getBean(OutputService.class);

        System.out.println(outputService.output());
    }

}
