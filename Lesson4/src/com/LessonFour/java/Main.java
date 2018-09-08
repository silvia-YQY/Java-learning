package com.LessonFour.java;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // 泛型  <>  尖括号内定义
        HashMap<String, Integer> counts = new HashMap<String, Integer>();
        Stack<String> stringStack = new Stack<String>();
        Stack<Integer> intStack = new Stack<Integer>();

        stringStack.push("abc");
        String one = stringStack.pop();

        intStack.push(5);
        Integer two = intStack.pop();

        // 列表
        List<String> arrayList = new ArrayList();
        List<String> linkedList = new LinkedList<String>();

        arrayList.add("5");
        arrayList.get(0);
        //arrayList.subList(0,5);  // 从位置0开始，到5的列表

        // 通过for循环遍历列表
        for(String item:arrayList){
            System.out.println(item);
        }

        // 集合  -- 主要用于去重操作[没有重复的]
        Set<String> set = new HashSet<String>();
        Set<String > set2 = new LinkedHashSet<String>();

        set.add("YQY");
        set.add("tom");
        set.add("john");
        set.add("tom");
        set.add("john");
        // 只要承继了 Iterable 接口的都可以用for(i:array) 的形式遍历
        for(String item:set){
            System.out.println(item);
        }

    }
}
