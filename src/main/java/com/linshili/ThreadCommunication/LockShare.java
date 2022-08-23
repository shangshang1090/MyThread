package com.linshili.ThreadCommunication;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockShare {
    private int num=0;
    private final Lock lock = new ReentrantLock();
     private Condition condition =lock.newCondition();
    public void incr() throws Exception {
          lock.lock();
          try {

              while(num!=0){
                  condition.await();
              }
              num++;
              System.out.println(Thread.currentThread().getName()+":"+num);
              condition.signalAll();
          }finally {
              lock.unlock();
          }
        System.out.println(Thread.currentThread().getName()+":"+num);
    }
    public void decr() throws Exception {
        lock.lock();
        try {
            while(num!=1){
              condition.await();
            }
            num--;
            System.out.println(Thread.currentThread().getName()+":"+num);
            condition.signalAll();
        }finally {
            lock.unlock();
        }

    }
}
