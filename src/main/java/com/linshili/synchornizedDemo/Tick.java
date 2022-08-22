package com.linshili.synchornizedDemo;

public class Tick {
    private int ticks=30;

    public synchronized boolean sale() throws Exception {
        if(ticks>0){
            System.out.println(Thread.currentThread().getName()+"：卖了一张票，剩下"+ticks--+"张票");
            wait(1);
        }else{
            System.out.println("抱歉，票已经卖完");
            return false;
        }
        return  true;
    }
}
