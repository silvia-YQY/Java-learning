package com.LessonFour.java;

import java.util.*;

public class TwoSums {
    ArrayList<Integer> twoSums(ArrayList<Integer> nums,Integer target){
        // 先判断数组内是否有重复数字
        Set<Integer> numSet = new HashSet<Integer>();
        for(Integer num : nums){
            numSet.add(num);
        }

        // 找到一对树的和 == target
        for(Integer num : nums){
            if(numSet.contains(target-num)){
                ArrayList<Integer> results = new ArrayList<Integer>();
                results.add(num);
                results.add(target - num);
                return results;
            }
        }
    }
}
