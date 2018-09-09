package com.SpiderDemo.java;
import com.SpiderDemo.java.model.*;
import com.SpiderDemo.java.view.ListViewer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Main {
    // 本地存储的内容如何在终端里面显示。

    // 写程序 step1 ：：抽象出——对象
    // step 2： 设计对象应有的属性、状态和行为。
    // step 3： 思考对象间的交互。
    // step 4： 开写。
    public static void main(String[] args) throws Exception {
        // 获取resources文件夹下，Reade_hub目录的路径。
        /*
        String resource_path = Main.class.getClassLoader().getResource("read_hub").getPath();

        NewsFactory newsReader = new NewsFactory(resource_path);
        ArrayList<News> newsList = newsReader.fetch();

        ArrayList<Viewable> viewableList = null;
        viewableList.addAll(newsList);

        ListViewer viewer = new ListViewer(viewableList);
        viewer.display();
        */

        // 广度优先搜索[使用队列]  ------  遍历的一种
        Queue<NewsWithRelated> newsQueue = new LinkedList<NewsWithRelated>();

        String startUrl = "https://readhub.cn/topic/7FZNR5RvV7n";


        NewsWithRelated startNews = UrlNewsReader.read(startUrl);

        newsQueue.add(startNews);
        while (!newsQueue.isEmpty()){
            NewsWithRelated current = newsQueue.poll();  // 取出队列头
            current.display();
            for(Map.Entry<String,String> entry : current.getRelateds().entrySet()){
                String url = entry.getValue();
                NewsWithRelated next = UrlNewsReader.read(url);
                newsQueue.add(next);

                System.out.println("——————————————————————————————————————————");

            }
        }


    }
}
