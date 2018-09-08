package com.SpiderDemo.java;
import com.SpiderDemo.java.model.News;
import com.SpiderDemo.java.model.NewsFactory;
import com.SpiderDemo.java.view.NewsListViewer;

import java.util.ArrayList;

public class Main {
    // 本地存储的内容如何在终端里面显示。

    // 写程序 step1 ：：抽象出——对象
    // step 2： 设计对象应有的属性、状态和行为。
    // step 3： 思考对象间的交互。
    // step 4： 开写。
    public static void main(String[] args) throws Exception {
        // 获取resources文件夹下，Reade_hub目录的路径。
        String resource_path = Main.class.getClassLoader().getResource("read_hub").getPath();
        
        NewsFactory newsReader = new NewsFactory(resource_path);
        ArrayList<News> newsList = newsReader.fetch();

        NewsListViewer viewer = new NewsListViewer(newsList);
        viewer.display();
    }
}
