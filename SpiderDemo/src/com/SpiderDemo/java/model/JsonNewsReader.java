package com.SpiderDemo.java.model;

import java.io.*;
import net.sf.json.*;

import net.sf.json.JSONObject;
import org.apache.commons.io.FileUtils;

public class JsonNewsReader extends NewsReader {
    public JsonNewsReader(File file) {
        super(file);
    }

    @Override
    public News readNews(){
        News news = null;
        try {
            String jsonString = FileUtils.readFileToString(file,"UTF-8");
            JSONObject jsonObject = new JSONObject(jsonString);
            String title = jsonObject.getString("title");
            String content = jsonObject.getString("content");
            news = new News(title,content);
        } catch (IOException e) {
            System.out.println("新闻读取出错！");
        } catch (JSONException e){
            System.out.println("Json解析出错！");
        }

        return news;
    }
}
