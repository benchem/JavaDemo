package com.github.benchem.util;

import cn.hutool.core.thread.ThreadUtil;

public class Print {

    /**
     * 控制台输出
     * @param s 待输出内容
     */
    public static void tco(Object s) {

        String ctf = String.format("[%s]: %s", Thread.currentThread().getName(), s);
        ThreadUtil.execute(()->{
           synchronized (System.out) {
               System.out.println(ctf);
           }
        });
    }

}
