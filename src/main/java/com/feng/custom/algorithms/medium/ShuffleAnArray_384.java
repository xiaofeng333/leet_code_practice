package com.feng.custom.algorithms.medium;

import java.util.ArrayList;
import java.util.Random;

/**
 * 打乱数组: https://leetcode-cn.com/problems/shuffle-an-array/
 */
public class ShuffleAnArray_384 {

    private final int[] origin;
    private int[] nums;

    public ShuffleAnArray_384(int[] nums) {
        this.origin = nums;
        this.nums = new int[origin.length];
        System.arraycopy(origin, 0, this.nums, 0, this.origin.length);
    }

    public int[] reset() {
        System.arraycopy(origin, 0, this.nums, 0, this.origin.length);
        return nums;
    }

    public int[] shuffle() {
        ArrayList<Integer> list = new ArrayList<>(origin.length);
        for (int temp : origin) {
            list.add(temp);
        }
        Random random = new Random();
        for (int i = 0; i < origin.length; i++) {
            int index = random.nextInt(list.size());
            nums[i] = list.remove(index);
        }
        return nums;
    }
}
