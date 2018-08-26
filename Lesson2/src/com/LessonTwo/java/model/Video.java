package com.LessonTwo.java.model;

public class Video implements Displayable {
    @Override
    //
    public String display(){
        System.out.println("从接口（interface）中重写方法,读取video");
        return "从接口（interface）中重写方法,读取video";
    }

}
