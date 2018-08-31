package com.LessonThree.java;

import java.util.*;

public class FackStack {
    private Stack<Integer> stack = new Stack<Integer>();
    private LinkedList<Integer> queue = new LinkedList<Integer> ();
    //栈：先进后出, 后进先出
    public void runStack(){
        //插入
        stack.push(5);
        stack.push(3);
        // 取出
        System.out.println(stack.pop()); // 3
        System.out.println(stack.pop()); // 5

        // 深度优先搜索！！ 本质就是栈的使用
        // 只看顶部数据，但是不删除
        // System.out.println("stack.peek ^^^^^^"+stack.peek());
        // 检查是否为空
        System.out.println("stack.isEmpty ^^^^^^"+stack.isEmpty());

    }
    // 队列
    // 先进先出
    public void  runQueue(){
        //插入
        queue.add(30);
        queue.add(50);
        // 取出
        System.out.println(queue.pop()); //  30
        System.out.println(queue.pop()); //  50

        Integer First_OF_queue = (Integer) queue.peek();
        System.out.println("peek"+queue.peek()); //  50

        System.out.println("peek"+queue.isEmpty()); //  判断是否为空

    }

}
