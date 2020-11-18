package com.feng.custom.algorithms.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和: https://leetcode-cn.com/problems/two-sum/
 * 给定一个整数数组nums和一个目标值target, 请你在该数组中找出和为目标值的那两个整数, 并返回他们的数组下标。
 */
public class TwoSum_1 {

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return new int[0];
    }
}
