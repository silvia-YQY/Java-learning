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
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String title = reader.readLine(); // 读取第一行：title
                    reader.readLine(); // 空行作为内容分割
                    String content = reader.readLine(); // 读取内容（第三行开始）；
                    News news = new News(title,content);

                    newsList.add(news);
                } catch (java.io.IOException e) {
                    System.out.println("新闻读取出错！");
                }
            }
        }
        return newsList;
    }
}
