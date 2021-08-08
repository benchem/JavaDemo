package com.github.benchem.thread;

import com.github.benchem.util.Print;

public class InterruptTarget extends Thread {

    static int threadSeqNumber = 1;

    public InterruptTarget() {

        super("interrupt thread - " + threadSeqNumber);
        threadSeqNumber++;
    }

    @Override
    public void run() {

        try{
            Print.tco(String.format("%s - 进入睡眠.", getName()));
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Print.tco(String.format("%s - 发生被打断异常.", getName()));
            return;
        }

        Print.tco(String.format("%s - 正常完成.", getName()));
    }
}
