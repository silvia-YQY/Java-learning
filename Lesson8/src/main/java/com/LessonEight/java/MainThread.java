package com.LessonEight.java;

public class MainThread extends Thread {

    public static void main(String args[]) {
        SonOneThread t1 = new SonOneThread("Thread One");
        SonTwoThread t2 = new SonTwoThread("Thread Two");

        // 线程运行
        try {
            for (int n = 100; n > 0; n--) {
                System.out.println(n );
                Thread.sleep(1);  // 暂停执行该线程一段时间。此为暂停执行1s，再继续执行。
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");

        }
    }

}
