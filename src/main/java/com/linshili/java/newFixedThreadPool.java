package com.linshili.java;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class newFixedThreadPool {
    public static void main(String[] args) throws Exception {
        //创建3个线程的固定线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Future<String> submit = pool.submit(new MyCallable(50));
        String s = submit.get();
        System.out.println(s);
    }
}
