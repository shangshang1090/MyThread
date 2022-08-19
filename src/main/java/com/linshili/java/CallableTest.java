package com.linshili.java;

import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) throws Exception {
        MyCallable myCallable = new MyCallable(50);
        FutureTask<String> task = new FutureTask<>(myCallable);
        Thread thread = new Thread(task);
        thread.start();
        try {
            String s = task.get();
            System.out.println(s);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
