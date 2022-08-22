package com.linshili.synchornizedDemo;

public class testSynchornized {
    public static void main(String[] args) {
            //创建对象
        Tick tick = new Tick();
        Thread t1 =new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                try {
                    if(tick.sale()) {
                        tick.sale();
                    }else {
                        return;
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
         },"aa");
        t1.start();
      Thread t2=  new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                try {
                    if(tick.sale()) {
                        tick.sale();
                    }else {
                        return;
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
         },"bb");
      t2.start();
       Thread t3 = new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                try {
                    if(tick.sale()) {
                        tick.sale();
                    }else {
                        return;
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
         },"cc");
       t3.start();
    }
}
