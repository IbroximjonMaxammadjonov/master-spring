package com.ibroximjon.concurency_multithreading;

import com.ibroximjon.concurency_multithreading.runnables.AppRunnable;

import java.io.*;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class TestRunnable {

    public static void main(String[] args) {
        Runnable runnable = new AppRunnable();
        /*runnable.run();
        Thread thread = new Thread(runnable);
        thread.start();*/

        Executor executor = Executors.newCachedThreadPool();
        executor.execute(runnable);
    }
}
