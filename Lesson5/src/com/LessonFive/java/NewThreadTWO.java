package com.LessonFive.java;

public class NewThreadTWO extends Thread{
    NewThreadTWO(String name){
        // create a new, second thread
        super(name);
        System.out.println(name+"NewThreadTWO: "+ this);
        // 显式的开始执行该线程 ， 直接调用基本的初始化操作【例如开辟内存器空间，获得内存等操作，与操作系统进行沟通】
        // 初始化后，会自动执行 run 方法。
        // 故不建议重载start方法，只需要重载run方法
        start();
    }

    // 新的线程入口
    public void run(){
        System.out.println("这个逻辑用来体现一下另外一个类的线程");
    }
}
