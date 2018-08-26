package com.LessonTwo.java.model;

public class News implements Displayable{
    private String title;
    private String content;
    protected News(){}
    //构造的自由和责任交给用户
    public News(String title, String content){
        this.title = title;
        this.content = content;
    }

    public String getTitle(){
        return title;
    }

    public String getContent(){
        return content;
    }

    //控制如何显示
//    public String display(){
//        return title + "\n" + content;
//    }

    @Override
    //使用接口中的display
    public String display(){
        System.out.println("News中打印" + "\n"+ title + "\n" + content);
        return "News中打印" + "\n"+ title + "\n" + content;
    }
}
