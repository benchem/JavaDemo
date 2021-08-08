package com.github.benchem;

import com.github.benchem.thread.InterruptTarget;
import com.github.benchem.thread.RunTarget;

public class Program {

    public static void main(String[] args) {

        Runnable target = new RunTarget();
        new Thread(target).start();
        new Thread(target).start();
        new Thread(target).start();
        new Thread(target, "MY-THREAD-1").start();
        new Thread(target, "MY-THREAD-2").start();

        Thread inT1 = new InterruptTarget();
        inT1.start();

        Thread inT2 = new InterruptTarget();
        inT2.start();

        sleepSeconds(2);
        inT1.interrupt();

        sleepSeconds(5);
        inT2.interrupt();

        sleepSeconds(15);

    }

    static void sleepSeconds(int sec) {

        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            //ignore
        }

    }
}
