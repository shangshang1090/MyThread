package com.linshili.ThreadCommunication;

public class share {
    private int num=0;
    public synchronized void incr() throws Exception {
        //用while代替if解决虚假唤醒问题
        while(num!=0){
            this.wait();
        }
        num++;
        System.out.println(Thread.currentThread().getName()+":"+num);
        this.notifyAll();
    }
    public synchronized void decr() throws Exception {
        while(num!=1){
            this.wait();
        }
        num--;
        System.out.println(Thread.currentThread().getName()+":"+num);
        this.notifyAll();
    }
}
