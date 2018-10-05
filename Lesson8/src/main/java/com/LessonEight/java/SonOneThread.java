package com.LessonEight.java;

public class SonOneThread extends Thread{
    SonOneThread(String name) {
        // create a new, second thread
        super(name);
        System.out.println(name + "  Child thread: " + this);
        // 显式的开始执行该线程 ， 直接调用基本的初始化操作【例如开辟内存器空间，获得内存等操作，与操作系统进行沟通】
        // 初始化后，会自动执行 run 方法。
        // 故不建议重载start方法，只需要重载run方法
        // start();
        startTread(name);
    }

    public void startTread(String name) {
        System.out.println("child thread: " + name + "开始执行");
        start();
    }

    //this is the entry point for the second thread.
    // 新的线程入口
    public void run() {
        try {
            for (char letter = 'a'; letter <= 'z'; letter++) {
                System.out.print("Child Thread: " + letter +  "\n");
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted");
        }
        System.out.println("Exiting child thread");
    }
}
