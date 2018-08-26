package com.LessonTwo.java.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileNews extends News {
    //有参数构造函数
    public FileNews(String title,String content){
        super(title,content);  //承继父类
    }
    //无参数构造函数
    public FileNews(){
        super();
    }

    //读方法
    public void read(String url){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(url)));
        } catch (java.io.IOException e) {
            System.out.println("新闻读取出错");
        }
    }

    @Override
    //承继父类并重写
    public String display(){
        return super.display() + "\n" + "from FileNews 的子类";
    }
}
