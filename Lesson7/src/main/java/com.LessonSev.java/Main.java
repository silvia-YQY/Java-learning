package com.LessonSev.java;
import java.util.*;
import com.LessonSev.java.model.NewsWithRelated;
import com.LessonSev.java.model.UrlNewsReader;
import com.LessonSev.java.model.Viewable;

public class Main {
    static final int maximumURL = 100;
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
        long startTime = System.currentTimeMillis();
        Queue<NewsWithRelated> newsQueue = new LinkedList<NewsWithRelated>();  // 共享

        String startUrl = "https://readhub.cn/topic/7FZNR5RvV7n";
        NewsWithRelated startNews = UrlNewsReader.read(startUrl);

        //int count = 0;// 共享
        Set<String> visited = new HashSet<String>();// 共享
        //visited.add(startUrl);
        newsQueue.add(startNews);
        ArrayList<Viewable> results = new ArrayList<Viewable>();

        while (!newsQueue.isEmpty() ){
            NewsWithRelated current = newsQueue.poll();  // 取出队列头
            //results.add(current);
            current.display();
            //count += 1;
            for(Map.Entry<String,String> entry : current.getRelateds().entrySet()){
                String url = entry.getValue();
                NewsWithRelated next = UrlNewsReader.read(url);
                // 可以并行,同时读取网站
                //if(!visited.contains(url)){
                    newsQueue.add(next);
                //    visited.add(url);
                //}

            }
        }
        long endTime = System.currentTimeMillis();
        //new ListViewer(results).display();
        //System.out.println("总结过数量："+results.size());
        System.out.println("程序运行时间："+(endTime-startTime)+"ms");

    }
}
