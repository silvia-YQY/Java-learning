package com.SpiderDemo.java;
import com.SpiderDemo.java.model.*;
import java.util.*;

public class MultlThreadMain {
    static final int maximumURL = 100;

    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();

        // 广度优先搜索[使用队列]  ------  遍历的一种
        SearchSate searchSate = new SearchSate(100);  // 被共享

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
