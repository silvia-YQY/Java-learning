package com.LessonFour.java;

import java.util.ArrayList;

public class StringStack {
    ArrayList<String> store = new ArrayList<String>();
    public void push(String item){
        // 在List的尾部添加元素
        store.add(item);
    }

    public String pop(){
        // 通过索引（随机）访问数据
        String tmp = store.get(store.size()-1);
        // 通过索引，删除相应的元素。
        store.remove(store.size()-1);
        return tmp;
    }
}
