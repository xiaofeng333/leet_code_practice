package com.feng.custom.algorithms.simple;

/**
 * 重新排列数组: https://leetcode-cn.com/problems/shuffle-the-array/
 * 题解: https://leetcode-cn.com/problems/shuffle-the-array/solution/kong-jian-fu-za-du-wei-o1-de-liang-chong-jie-fa-by/
 */
public class ShuffleTheArray_1470 {

    /**
     * 题解中的方法1
     */
    public int[] shuffle(int[] nums, int n) {
        int j;
        for (int i = 0; i < 2 * n; i++) {
            j = i < n ? 2 * i : 2 * (i - n) + 1;
            nums[j] |= (nums[i] & 1023) << 10;
        }
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = nums[i] >> 10;
        }
        return nums;
    }
}
