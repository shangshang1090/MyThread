package com.linshili.ThreadCommunication;

public class testThreadCommunication {
    public static void main(String[] args) {
        share share = new share();
        Thread t1 = new Thread(() -> {
           for (int i = 0; i < 10; i++) {
               try {
                   share.incr();
               } catch (Exception e) {
                   throw new RuntimeException(e);
               }
           }
        },"aa");
        t1.start();
        Thread t2 = new Thread(() -> {
           for (int i = 0; i < 10; i++) {
               try {
                   share.decr();
               } catch (Exception e) {
                   throw new RuntimeException(e);
               }
           }
        },"bb");
        t2.start();
    }
}
