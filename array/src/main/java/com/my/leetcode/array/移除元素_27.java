/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.my.leetcode.array;

/**
 * @Author Reverie
 * @Date 2020/7/23
 *
 * 问题：
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素
 *
 *
 * 事例：
 * 给定 nums = [3,2,2,3], val = 3,
 * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 * 思路：
 *          a
 * [1,2,3,4,5,5] 5
 * fast=5
 * slow=4
 *    a b
 * [1,2,2,3,3,4,5] 2
 * fast=2
 * slow=1
 *  a  b
 * [1, 2, 2, 3, 2, 4, 2, 5, 2] 2
 *     ab
 * [1, 2, 2, 3, 2, 4, 2, 5, 2] 2
 *     a  b
 * [1, 2, 2, 3, 2, 4, 2, 5, 2] 2
 */
public class 移除元素_27 {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[] {1, 2, 2, 3, 2, 4, 2, 5, 2}, 2));
    }


    public static int removeElement(int[] nums, int val) {
        int slow = 0,fast = 1;
        while (nums.length > fast){
            if (nums[slow] == val){
                nums[slow] = nums[fast];
            }else {
                slow ++;
                fast = slow + 1;

            }
        }
        return slow;
    }
}
