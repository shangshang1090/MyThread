package com.linshili.ThreadAPI;

import java.util.concurrent.Semaphore;

public class semaphoreTest {
    public static void main(String[] args) {
        //创建许可数量
        Semaphore semaphore = new Semaphore(3);

        for (int i = 1; i <= 6; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire();//获取许可
                    System.out.println(Thread.currentThread()+"停车");
                    Thread.sleep(3000);
                    System.out.println("离开车位");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }finally {
                    semaphore.release();
                }
            }).start();
        }
    }
}