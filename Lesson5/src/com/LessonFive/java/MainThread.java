package com.LessonFive.java;

public class MainThread {

    public static void main(String args[]) {
        Thread t = Thread.currentThread();//获取当前线程对象，此例为主线程。
        // 在java语言语法层面，线程就是一个Thread类的对象

        System.out.println("Current Thread :" + t);
        //change the name of the thread
        t.setName("My Thread");
        System.out.println("id:" + t.getId()); // 自带toString 方法。
        System.out.println("After name change: " + t);
        // 线程运行
        try { 
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(5000);  // 暂停执行该线程一段时间。此为暂停执行1s，再继续执行。
            }
        }catch(InterruptedException e){
            System.out.println("Main thread interrupted");

        }
    }

}
