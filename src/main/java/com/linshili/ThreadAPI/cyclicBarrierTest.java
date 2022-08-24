package com.linshili.ThreadAPI;

import java.util.concurrent.CyclicBarrier;

public class cyclicBarrierTest {
    private static final int NUM =7;

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(NUM, () -> {
            System.out.println("你好,许愿");
        });
        for (int i = 1; i <=7 ; i++) {
            new Thread(() -> {

                try {
                    System.out.println("收集了一颗龙珠");
                    cyclicBarrier.await();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }).start();
        }
    }
}
