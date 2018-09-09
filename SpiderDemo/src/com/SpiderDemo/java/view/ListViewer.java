package com.SpiderDemo.java.view;
import com.SpiderDemo.java.model.News;
import java.util.ArrayList;
import com.SpiderDemo.java.model.Viewable;

// 该类职责：显示内容，不关心内容是什么。
public class ListViewer {
    private ArrayList<Viewable> viewableList ;

    public ListViewer(ArrayList<Viewable> viewableList) {
        this.viewableList = viewableList;
    }

    public void display(){
        for(Viewable viewableItem : viewableList ){
            System.out.println("__________________________________");
            viewableItem.display();
        }
    }
}
