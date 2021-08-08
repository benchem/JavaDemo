package com.github.benchem;

import com.github.benchem.thread.RunTarget;

public class Program {

    public static void main(String[] args) {

        RunTarget target = new RunTarget();
        new Thread(target).start();
        new Thread(target).start();
        new Thread(target).start();
        new Thread(target, "MY-THREAD-1").start();
        new Thread(target, "MY-THREAD-2").start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
