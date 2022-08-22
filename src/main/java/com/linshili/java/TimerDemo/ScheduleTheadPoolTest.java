package com.linshili.java.TimerDemo;


import java.util.concurrent.*;

public class ScheduleTheadPoolTest {
    public static void main(String[] args) {
        //线程池是定时器，固定线程的
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(10);
        //开启定时任务
        pool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("你好");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },0,2,TimeUnit.SECONDS);

        pool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("你好2");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },0,2,TimeUnit.SECONDS);

        pool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("你好3");
                try {
                    Thread.sleep(5000);
                    int a =10/0;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        },0,2,TimeUnit.SECONDS);

        pool.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("你好4");

            }
        },0,2,TimeUnit.SECONDS);
    }

}
