package com.linshili.ThreadAPI;

import java.util.concurrent.CountDownLatch;

public class countDownTest {
    public static void main(String[] args) throws Exception {
        //创建限制锁
        CountDownLatch count = new CountDownLatch(5);
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <=5; i++) {
                    System.out.println(i+"号同学离开了");
                    count.countDown();
                }
            }
        }).start();
        count.await();
        System.out.println("锁门");
    }
}
