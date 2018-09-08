package com.LessonThree.java;

import java.util.ArrayList;

public class sorting {
//    快排
    public static void qsort(Integer left ,Integer right,ArrayList<Integer> input){
        // 1. 选出一个数
        Integer p = pivot(input);
        // 2. 分块
        input = partition(left,right,p,input);

        // 3. 对两部分的快继续排序

        // 4. 合并

    }

    // 随机出一个数
    public static Integer pivot(ArrayList<Integer> input){
        return input.get(0);  //最简单的方法为取出第一个数
    }

    // 分块
    private static ArrayList<Integer> partition(Integer left ,Integer right, Integer p, ArrayList<Integer> input){
        int i = left, j = right;
        int tmp = input.get(left);

        while(i<j){
            while (i<j && input.get(i) > tmp){
                i++;
            }
            while (i<j && input.get(j) < tmp){
                j--;
            }

            if(i<j){
                int mid = input.get(i);
                input.set(i,input.get(j));
                input.set(j,mid);
            }
        }

        // i ==j = privot
        if(left < i){
            qsort(left,i,input);
        }

        if(i < right){
            qsort(i,right,input);
        }


        return null;
    }

}
