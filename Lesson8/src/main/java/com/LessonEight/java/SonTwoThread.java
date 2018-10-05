package com.LessonEight.java;

public class SonTwoThread extends Thread{
    SonTwoThread(String name) {
        super(name);
        System.out.println(name + "  Child thread: " + this);
        startTread(name);
    }

    public void startTread(String name) {
        System.out.println("child thread: " + name + "开始执行");
        start();
    }
    public void run() {
        try {
            for (char letter = 'A'; letter <= 'Z'; letter++) {
                System.out.print("Child Thread: " + letter +  "\n");
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted");
        }
        System.out.println("Exiting child thread");
    }
}
