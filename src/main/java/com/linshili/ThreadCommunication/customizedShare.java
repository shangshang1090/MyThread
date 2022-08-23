package com.linshili.ThreadCommunication;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class customizedShare {
    private int flag=1;
    private final Lock lock = new ReentrantLock();
    private Condition c1 =lock.newCondition();
    private Condition c2 =lock.newCondition();
    private Condition c3 =lock.newCondition();
    public void print5(int num) throws Exception {
        lock.lock();
        try {
            if(flag!=1){
                c1.await();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+"第"+i+"次打印"+"本次是第"+num+"轮");
            }
            flag=2;
            c2.signal();
        }finally {
            lock.unlock();
        }
    }
    public void print10(int num) throws Exception {
        lock.lock();
        try {
            if(flag!=2){
                c2.await();
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+"第"+i+"次打印"+"本次是第"+num+"轮");
            }
            flag=3;
            c3.signal();
        }finally {
            lock.unlock();
        }
    }
    public void print15(int num) throws Exception {
        lock.lock();
        try {
            if(flag!=3){
                c3.await();
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+"第"+i+"次打印"+"本次是第"+num+"轮");
            }
            flag=1;
            c1.signal();
        }finally {
            lock.unlock();
        }
    }
}
