package com.LessonFour.java;
import java.util.ArrayList;

public class Stack<T> {
    ArrayList<T> store = new ArrayList<T>();

    public void push(T item){
        store.add(item);
    }

    public T pop(){
        T tmp = store.get(store.size()-1);
        store.remove(store.size()-1);
        return tmp;
    }

    public int size(){
        return store.size();
    }
}
