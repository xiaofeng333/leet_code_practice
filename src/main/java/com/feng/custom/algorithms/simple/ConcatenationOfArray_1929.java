package com.feng.custom.algorithms.simple;

/**
 * 数组串联: https://leetcode-cn.com/problems/concatenation-of-array/
 */
public class ConcatenationOfArray_1929 {

    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }
        return result;
    }
}
