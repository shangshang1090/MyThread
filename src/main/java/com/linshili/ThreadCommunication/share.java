package com.linshili.ThreadCommunication;

public class share {
    private int num=0;
    public synchronized void incr() throws Exception {
        if(num!=0){
            this.wait();
        }
        num++;
        System.out.println(Thread.currentThread().getName()+":"+num);
        this.notifyAll();
    }
    public synchronized void decr() throws Exception {
        if(num!=1){
            this.wait();
        }
        num--;
        System.out.println(Thread.currentThread().getName()+":"+num);
        this.notifyAll();
    }
}
