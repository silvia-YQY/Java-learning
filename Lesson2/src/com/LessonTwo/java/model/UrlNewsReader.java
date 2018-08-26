package com.LessonTwo.java.model;

public class UrlNewsReader extends NewsReader {
    @Override
    public News readNews(String path){
        //从文件读取，解析
        return new News("URL","从URL中读取");
    }
}
