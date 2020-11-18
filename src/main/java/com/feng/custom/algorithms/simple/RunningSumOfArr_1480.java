package com.feng.custom.algorithms.simple;

/**
 * 一维数组的动态和: https://leetcode-cn.com/problems/running-sum-of-1d-array/
 * 给你一个数组nums。数组动态和的计算公式为: runningSum[i] = sum(nums[0]…nums[i])
 */
public class RunningSumOfArr_1480 {

    public int[] runningSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        int[] returnArr = new int[nums.length];
        returnArr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            returnArr[i] = nums[i] + returnArr[i - 1];
        }
        return returnArr;
    }
}
