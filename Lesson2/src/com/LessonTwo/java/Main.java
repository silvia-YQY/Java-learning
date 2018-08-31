package com.LessonTwo.java;

import com.LessonTwo.java.model.*;

//抽象类：表达is-a关系，子类的具体方法是父类的方法。
//接口：并不能表达is-a的关系，只是表达该方法具有某种特性，例如限制输入输出。

public class Main {

    public static void main(String[] args) {
        News news = new News("第一篇文章","来自父类的第一篇文章");
        Video video = new Video();

        //多态
        //因为Video，News类都引用了Displayable接口的，故都可以传进去
        viewNews(video);
        viewNews(news);

        //若不使用接口，则需要每个子类分别创建
        News news1 = read(new UrlNewsReader(),"path_url");
        News news2 = read(new FileNewsReader(),"path_url");

        //实现承继并重写
        FileNews fileNews = new FileNews("第二篇文章","来自子类的第二篇文章");
        System.out.println("main中打印" + "\n" + fileNews.display());
    }

    //传参为只要是成功引用了Displayable接口的类均可
    //这里实现了多态
    //多态，指没有输入限制（类型）的方法，只关注运行过程
    //也称为鸭子类型
    private static void viewNews(Displayable item){
        item.display();
        System.out.println("播放完毕");
    }

    //若不是用接口，则需要在主函数内，每个子类的方法分别实现。因为子类中readNews方法的传参都不一样。
    private static News read(UrlNewsReader reader,String path){
        return reader.readNews(path);
    }
    private static News read(FileNewsReader reader,String path){
        return reader.readNews(path);
    }



}
