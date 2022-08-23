package com.linshili.ThreadCommunication;

public class testCustomizedCommunicationOfThreads {
    public static void main(String[] args) {
        customizedShare share = new customizedShare();
        new Thread(() -> {
           for (int i = 1; i <=10; i++) {
               try {
                   share.print5(i);
               } catch (Exception e) {
                   throw new RuntimeException(e);
               }
           }
        },"aa").start();

        new Thread(() -> {
            for (int i = 1; i <=10; i++) {
                try {
                    share.print10(i);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        },"bb").start();

        new Thread(() -> {
            for (int i = 1; i <=10; i++) {
                try {
                    share.print15(i);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        },"cc").start();
    }
}
