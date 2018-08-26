package com.LessonTwo.java.model;
//抽象类与普通类一样可具有成员变量、构造函数、非抽象方法等。。。。
public abstract class NewsReader {
    //成员变量
    private Integer x;
    //构造函数
//    public NewsReader(int x){
//        this.x = x;
//    }
    //非抽象方法
    public Integer getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    //抽象类中的抽象方法，只声明具有这个功能，但具体实现方法在子类中确定。
    public abstract News readNews(String path);
}
