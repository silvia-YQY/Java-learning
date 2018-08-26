package com.LessonTwo.java.model;

public class Lecture implements Displayable{
    @Override
    public String display(){
        System.out.println("从接口（interface）中重写方法,读取Lecture");
        return "从接口（interface）中重写方法,读取Lecture";
    }
}
