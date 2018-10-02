package com.SpiderDemo.java.model;

import java.io.IOException;


public class SpiderThread extends Thread{
    private String url;
    private SearchSate searchSate;

    public SpiderThread(SearchSate searchSate, String url){
        this.url = url;
        this.searchSate = searchSate;
        start();
    }

    @Override
    public void run(){
        try{
            NewsWithRelated next = UrlNewsReader.read(url);
            searchSate.visit(next);
        } catch(IOException e) {
            System.out.println("Ignored on error page: " + url);
        }
    }
}
