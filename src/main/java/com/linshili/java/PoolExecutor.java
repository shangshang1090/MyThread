package com.linshili.java;

import com.sun.jndi.ldap.pool.PooledConnectionFactory;

import java.util.concurrent.*;

public class PoolExecutor {
    public static void main(String[] args) throws Exception {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3, 6, 5, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        //runnable 方法
    /*    MyRunnable runnable = new MyRunnable();
       pool.execute(runnable);*/
        //callable方法
        Future<String> submit = pool.submit(new MyCallable(50));
        String s = submit.get();
        System.out.println(s);
    }
}
