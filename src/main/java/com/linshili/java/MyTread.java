package com.linshili.java;

public  class MyTread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread()+":方式一子线程");

        }
    }
}
