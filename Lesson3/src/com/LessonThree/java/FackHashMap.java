package com.LessonThree.java;

import java.util.*;

public class FackHashMap {
    // 哈希表实现一个map，声明一个哈希表
    // 时间复杂度为 O(1)
    private HashMap<String, String> gender = new HashMap<String, String>();
    public void runHashMap(){
        //每个人对应的性别
        //增
        gender.put("YQY","female");
        //查①  优
        if(gender.containsKey("YQY")){ //先判断是否存在
            System.out.println(gender.get("YQY")); //存在则打印
        }

        //改
        gender.put("YQY","MALE");  //改，则为覆盖原有信息
        //查②
        String result = gender.get("YQY");  // 获取，若不存在则返回null
        if(result !=null){ // 判断是否为null
            System.out.println(gender.get("YQY"));  // 不为null则打印
        }

        // 删除
        gender.remove("YQY");
    }

}
