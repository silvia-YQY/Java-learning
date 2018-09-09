package com.SpiderDemo.java.view;
import com.SpiderDemo.java.model.News;
import java.util.ArrayList;

// 该类职责：显示读取出来的文件内容
public class NewsListViewer {
    private ArrayList<News> newsList ;

    public NewsListViewer(ArrayList<News> newsList) {
        this.newsList = newsList;
    }

    public void display(){
        for(News news : newsList ){
            news.display();
        }
    }
}
