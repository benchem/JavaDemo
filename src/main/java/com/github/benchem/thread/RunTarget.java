package com.github.benchem.thread;

import com.github.benchem.util.Print;

public class RunTarget implements Runnable{

    @Override
    public void run() {

        for (int index=0; index<3; index++) {

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Print.tco(String.format("run time: %d", index));
        }
    }
}
