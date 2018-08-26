package com.LessonTwo.java.model;

public class FileNewsReader extends NewsReader {
    @Override
    //确定承继来的抽象类中抽象方法readNews的具体实现方式
    //抽象类表达的意思为，is-a的关系。
    public News readNews(String path){
        //从文件读取，解析
        return new News("文件","从文件中读取");
    }
}
