package com.LessonFive.java;

// 自定义的县城类 NewThread
// 运行的代码逻辑和main（）【主线程】方法不同
public class NewThread extends Thread{
    NewThread(String name){
        // create a new, second thread
        super(name);
        System.out.println(name+"Child thread: "+ this);
        // 显式的开始执行该线程 ， 直接调用基本的初始化操作【例如开辟内存器空间，获得内存等操作，与操作系统进行沟通】
        // 初始化后，会自动执行 run 方法。
        // 故不建议重载start方法，只需要重载run方法
        start();
    }

    public void startTread(){
        System.out.println("child thread: " + "开始执行");
        start();
    }

    //this is the entry point for the second thread.
    // 新的线程入口
    public void run(){
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);  // 暂停执行该线程一段时间。此为暂停执行1s，再继续执行。
            }
        }catch(InterruptedException e){
            System.out.println("Child thread interrupted");
        }
        System.out.println("Exiting child thread");
    }

    // 主线程的逻辑
    public static void main(String args[]){
        // 创建新的子线程
        NewThread t1 = new NewThread("Thread One");
        NewThread t2 = new NewThread("Thread Two");
        NewThreadTWO t3 = new NewThreadTWO("Thread Two");

        // t.startTread();  // 手动调用
        try{
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);  // 暂停执行该线程一段时间。此为暂停执行1s，再继续执行。
            }
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main child thread");
    }


}
