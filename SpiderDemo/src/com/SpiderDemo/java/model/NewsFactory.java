package com.SpiderDemo.java.model;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

//该类职责为读取文件，并生成News对象。
public class NewsFactory {
    private File newsDir;
    public NewsFactory(String dir) throws Exception {
        newsDir = new File(dir);
        if(!newsDir.exists()){
            throw new Exception("路径不存在！");
        }

        if(!newsDir.isDirectory()){
            throw new Exception("该路径不是合法目录！");
        }
    }

    public ArrayList<News> fetch(){
        ArrayList<News> newsList = new ArrayList<News>();
        File[] files =  newsDir.listFiles();
        if(files != null){
            for(File file : files){
                NewsReader newsReader = null;
                if(file.getName().endsWith(".txt")){
                    newsReader = new TextNewsReader(file);
                }else if(file.getName().endsWith(".json")){
                    newsReader = new JsonNewsReader(file);
                }
                News news = newsReader.readNews();
                newsList.add(news);
            }
        }
        NewsWithRelated newsWithRelated = new NewsWithRelated("java爬虫","YQY");
        newsWithRelated.addRelated("9.9","java爬虫11");
        newsWithRelated.addRelated("9.10","java爬虫22");
        newsList.add(newsWithRelated);
        return newsList;
    }
}
