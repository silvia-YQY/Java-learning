package com.LessonFive.java;

public class RunableMultiThreads {
    static class NewThreadRun implements Runnable{
        private String name;
        // 定义一个私有的Thread对象。
        private Thread t;

        NewThreadRun(String threadName){
            name = threadName;
            // 创建按一个对象，把this传递给这个Thread，本质就是为了给它run（）方法。
            t = new Thread(this,name);
            System.out.println("New thread: " + t);
            t.start(); // 开始线程

        }

        // 线程入口
        public void run(){
            for (int i = 5; i > 0; i--) {
                System.out.println(name + i);
            }
            System.out.println(name+": Exiting child thread.......");
        }

        public static void main(String args[]){
            new NewThreadRun("one");
            new NewThreadRun("two");
            new NewThreadRun("three");

            System.out.println("Main thread exiting.");
        }

    }

}
