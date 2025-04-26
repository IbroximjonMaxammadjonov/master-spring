package com.ibroximjon.concurency_multithreading;

import com.ibroximjon.concurency_multithreading.runnables.AppRunnable;

import java.io.*;

public class TestRunnable {

    public static void main(String[] args) {
        Runnable runnable = new AppRunnable();
        runnable.run();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
