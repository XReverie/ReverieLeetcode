/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.my.leetcode.array;

/**
 * @Author Reverie
 * @Date 2020/7/23
 *
 *
 * 问题：
 * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成
 *
 * 事例：
 * 给定数组 nums = [1,1,2],
 * 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 * 你不需要考虑数组中超出新长度后面的元素。
 *
 * 思路：
 * 注意这是有序的数组，所以重复的数字都挨着
 *  a b
 * [1,1,1,2,2,3,3,3,4,4,4,4,4,5]
 * 使用双指针，比较a,b是否相等，如果相等，b移动到b+1位置，继续比较，
 * 如果不相等，将b位置的数字移到a+1位置，a向后移到一位，b移一位 继续比较
 * 当b的大于数组长度时结束
 *
 *
 */
public class 删除排序数组中的重复项_26 {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {1, 2, 3, 4, 5}));
    }

    public static int removeDuplicates(int[] nums) {
        int fast = 1,slow = 0;
        while (nums.length > fast){
            if (nums[slow] == nums[fast]){
                fast ++ ;
            }else {
                nums[++slow] = nums[fast++];
            }
        }
        return ++slow;

    }
}
