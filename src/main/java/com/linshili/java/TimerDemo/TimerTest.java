package com.linshili.java.TimerDemo;



import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) {
        //创建timer定时器,定时器本身是一个单线程
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("你好");
            }
        },3000,2000);//delay指启动后几秒开始调度，period指每隔几秒执行一次
    }
}
