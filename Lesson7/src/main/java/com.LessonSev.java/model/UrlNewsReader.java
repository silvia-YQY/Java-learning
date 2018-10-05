package com.LessonSev.java.model;

import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

import java.io.IOException;

// 从链接中读取内容（HTML）
public class UrlNewsReader {
    public static NewsWithRelated read(String url) throws IOException {
        // jsoup 读取和解析页面的 库。
        Document doc = Jsoup.connect(url).get();  // 返回 整个 HTML 页面【类型为Document】。

        // selete 语法。   1. 获取标签或者css的class、id中的node节点。
        String title = doc.select(".topicTitle___1M353").first().child(0).text();
        String content = doc.select(".summary___1i4y3").text();
        String meta = doc.select("meta[name=description]").attr("content"); //利用meta读取
//
//        System.out.println(topic);
//        System.out.println(content);

        NewsWithRelated news = new NewsWithRelated(title,content);
        Elements relatedItems = doc.select(".timeline__item___2eWUN");
        for(Element element : relatedItems){
            String relatedTitle = element.select(".content-item___3KfMq").text();
            String relatedUrl = element.children().get(3).child(0).absUrl("href");
            news.addRelated(relatedTitle,relatedUrl);
        }

        return news;

    }
}
