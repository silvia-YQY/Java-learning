package com.LessonFour.java;

import java.util.*;
/*
给定一个整数数组，返回只出现一次的那个整数。
例
[1,2,3,2,3]  ===> [1]
 */


public class SingleNumber {

    public int SingNumber(int[] nums){
        Set<Integer> numSet = new HashSet<Integer>();

        for (Integer num : nums) {
            if (numSet.contains(num)) {
                numSet.remove(num);
            } else {
                numSet.add(num);
            }
        }

        for(int num : numSet){
            return num;
        }
        return 0;
    }
}
