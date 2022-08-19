package com.linshili.java;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private int i;

    public MyCallable(int i) {
        this.i = i;
    }

    @Override
    public String call() throws Exception {
        int num=0;
        for (int j = 0; j <i ; j++) {
            num +=j;
        }
        return "子线程结果是："+num;
    }
}
