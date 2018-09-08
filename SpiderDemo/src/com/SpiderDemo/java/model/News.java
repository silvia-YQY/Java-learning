package com.SpiderDemo.java.model;

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
}
