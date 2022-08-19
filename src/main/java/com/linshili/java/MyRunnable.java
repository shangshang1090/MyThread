package com.linshili.java;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread()+":你好子线程");
        }
    }
}
