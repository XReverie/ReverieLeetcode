/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.my.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author xiamingyu
 * @Date 2020/7/22
 *
 * 问题：
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 *
 * 解题思路：
 * 使用map，将 数值与下标存到map中
 * key为数值 value为下标
 */
public class 两数之和 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] {2, 0, 7, 15}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = null;
        if(nums== null || nums.length == 0){
            return result;
        }
        Map<Integer,Integer> num = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (num.containsKey(target - nums[i])){
                result = new int[2];
                result[0] = num.get(target - nums[i]);
                result[1] = i;
            }else {
                num.put(nums[i], i);
            }
        }
        return result;
    }

}
