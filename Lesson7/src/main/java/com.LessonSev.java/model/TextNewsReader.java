package com.LessonSev.java.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// 该类承继NewsReader抽象类，并进行重写。主要为读取文本信息。
public class TextNewsReader extends NewsReader{
    public TextNewsReader(File file) {
        super(file);
    }

    @Override
    public News readNews(){
        News news = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String title = reader.readLine(); // 读取第一行：title
            reader.readLine(); // 空行作为内容分割
            String content = reader.readLine(); // 读取内容（第三行开始）；
            news = new News(title,content);

        } catch (IOException e) {
            System.out.println("新闻读取出错！");
        }
        return news;
    }
}
