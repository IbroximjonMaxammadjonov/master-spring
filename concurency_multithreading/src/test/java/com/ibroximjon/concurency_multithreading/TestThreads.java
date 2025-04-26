package com.ibroximjon.concurency_multithreading;

import com.ibroximjon.concurency_multithreading.runnables.AppThread;

public class TestThreads {

    public static void main(String[] args) {
        AppThread t1 = new AppThread();
        AppThread t2 = new AppThread();
        AppThread t3 = new AppThread();

        t1.start();
        t2.start();
        t3.start();
    }
}
