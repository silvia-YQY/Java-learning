package com.SpiderDemo.java.model;

// 该类工作为收集到读出去来的文件，进行操作
public class News {
    private String title;
    private String content;

    // 使用快键键（Fn+Alt+insert）创建构造函数，getter，setter
    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void display() {
        System.out.println("________________");
        System.out.println("Title:"+this.getTitle());
        System.out.println("Content:"+this.getContent());
    }
}
