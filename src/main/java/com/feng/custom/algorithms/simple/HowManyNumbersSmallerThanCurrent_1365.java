package com.feng.custom.algorithms.simple;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 有多少小于当前数字的数字: https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 * 亦可以考虑建立一个频次数组cnt, cnt[i]表示数字i出现的次数。那么对于数字i而言, 小于它的数目就为cnt[0...i-1]的总和。
 */
public class HowManyNumbersSmallerThanCurrent_1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int length = nums.length;
        int[][] arr = new int[length][2];
        for (int i = 0; i < length; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));
        int[] res = new int[length];
        int before = -1;
        for (int i = 0; i < length; i++) {
            if (before == -1 || arr[i][0] != arr[i - 1][0]) {
                before = i;
            }
            res[arr[i][1]] = before;
        }
        return res;
    }
}
