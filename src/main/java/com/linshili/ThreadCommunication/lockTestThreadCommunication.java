package com.linshili.ThreadCommunication;

public class lockTestThreadCommunication {
    public static void main(String[] args) {
        LockShare share =new LockShare();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    share.incr();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"aa");
        t1.start();

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    share.decr();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"bb");
        t2.start();
    }

}
