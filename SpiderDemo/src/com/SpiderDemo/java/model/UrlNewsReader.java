package com.SpiderDemo.java.model;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.jsoup.*;

import java.io.IOException;
// 从链接中读取内容（HTML）
public class UrlNewsReader {
    public static NewsWithRelated read(String url) throws IOException {
        // jsoup 读取和解析页面的 库。
        Document doc = Jsoup.connect(url).get();  // 返回 整个 HTML 页面【类型为Document】。
        Elements titleElements = doc.select(".topicTitle___1M353");
        // selete 语法。   1. 获取标签或者css的class、id中的node节点。  2.
        String topic = doc.select(".topicTitle___1M353").first().child(0).text();
        String content = doc.select(".summary___1i4y3").text();

        System.out.println(titleElements.size());
//        System.out.println(topic);
//        System.out.println(content);
//
//        System.out.println("________");
//        Elements relatedItems = doc.select("");
//
//        for(Element related : relatedItems){
//            System.out.println(related.text());
//        }
//
//        System.out.println(relatedItems.size());

        return null;

    }
}
