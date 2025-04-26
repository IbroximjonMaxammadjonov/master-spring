package com.ibroximjon.concurency_multithreading.runnables;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppRunnable implements Runnable {
    @Override
    public void run() {
        try(BufferedReader bw = new BufferedReader(new FileReader("C:\\Users\\Ibroximjon\\Desktop\\java-spring-projects\\spring_project\\concurency_multithreading\\src\\main\\resources\\sample.txt"))) {
            String line ;
            while((line = bw.readLine()) != null) {
                System.out.println(Thread.currentThread().getName() + ": " + line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    };

    public static void main(String[] args) {
        AppRunnable runnable = new AppRunnable();
        runnable.run();
    }
}
