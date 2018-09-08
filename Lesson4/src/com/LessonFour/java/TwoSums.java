package com.LessonFour.java;

import java.util.*;

/*
给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。

你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。

示例:

给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
 */
public class TwoSums {
    // 直接返回两位数
    ArrayList<Integer> twoSumsSet(ArrayList<Integer> nums,Integer target){
        // 先判断数组内是否有重复数字
        Set<Integer> numSet = new HashSet<Integer>();
        ArrayList<Integer> results = new ArrayList<Integer>();
        for(Integer num : nums){
            numSet.add(num);
        }

        // 找到一对树的和 == target
        for(Integer num : nums){
            if(numSet.contains(target-num)){
                results.add(num);
                results.add(target - num);
                return results;
            }
        }
        return results;
    }

    // 返回两位数的下标
    ArrayList<Integer> twoSumsMap(ArrayList<Integer> nums,Integer target){
        // 出现过的什么样的数字为key，位置为value。
        Map<Integer,Integer> numMap = new HashMap<Integer, Integer>();
        ArrayList<Integer> results = new ArrayList<Integer>();

        for(int i = 0; i < numMap.size(); i++){
            numMap.put(nums.get(i),i);
        }

        // 找到一对树的和 == target
        for(int j = 0; j < nums.size(); j++){
            if(numMap.containsKey(target-nums.get(j))){
                results.add(numMap.get(target- nums.get(j)));
                results.add(j);
                return results;
            }
        }
        return results;
    }
}
