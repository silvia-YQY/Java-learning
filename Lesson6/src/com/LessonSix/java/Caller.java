package com.LessonSix.java;

class Caller implements Runnable {  // 实现Runnable接口，承继线程类
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        // 每个线程都会”同时“调用此方法。
        target.call(msg);
    }
}