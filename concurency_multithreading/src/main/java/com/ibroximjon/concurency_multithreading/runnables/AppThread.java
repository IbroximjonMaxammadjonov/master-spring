package com.ibroximjon.concurency_multithreading.runnables;

import java.io.*;

public class AppThread extends Thread {
    @Override
    public void run() {
        try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Ibroximjon\\Desktop\\java-spring-projects\\spring_project\\concurency_multithreading\\src\\main\\resources\\sample.txt"))) {
            String line;
            while ((line = reader.readLine())!=null){
                System.out.println(Thread.currentThread().getName()+" reading the line"+line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
