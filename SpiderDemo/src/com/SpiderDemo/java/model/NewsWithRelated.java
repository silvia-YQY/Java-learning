package com.SpiderDemo.java.model;

import java.util.HashMap;
import java.util.Map;

public class NewsWithRelated extends News {
    private HashMap<String,String> relateds;
    // 承继
    public NewsWithRelated(String title, String content) {
        super(title, content);  // 调用News类的构造函数,先初始化父类的属性
        relateds = new HashMap<String, String>();   // 初始化自己的属性
    }

    public void addRelated(String title, String url){
        this.relateds.put(title,url);
    }

    public HashMap<String,String> getRelateds(){
        return this.relateds;
    }

    // 重写父类方法
    public void display(){
        super.display();
        System.out.println("Related:");
        for(Map.Entry<String,String> entry : this.relateds.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }




}
