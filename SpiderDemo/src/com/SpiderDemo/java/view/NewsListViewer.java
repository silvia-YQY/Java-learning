package com.SpiderDemo.java.view;
import com.SpiderDemo.java.model.News;
import java.util.ArrayList;

public class NewsListViewer {
    private ArrayList<News> newsList ;

    public NewsListViewer(ArrayList<News> newsList) {
        this.newsList = newsList;
    }

    public void display(){
        for(News news : newsList ){
            System.out.println("________________");
            System.out.println("Title:"+news.getTitle());
            System.out.println("Content:"+news.getContent());
        }
    }
}
