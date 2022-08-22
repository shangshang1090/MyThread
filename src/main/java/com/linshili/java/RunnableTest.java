package com.linshili.java;

public class RunnableTest {
    public static void main(String[] args) {
     /*   //多态方法创建任务类对象
        Runnable runnable = new MyRunnable();
        //把任务对象交给线程进行处理
        Thread thread = new Thread(runnable);
        thread.start();
        //lambda创建，快捷键option＋回车*/
   Runnable r = () -> {
       System.out.println("你好");
   };
        Thread thread = new Thread();
        thread.start();
    }
}
