package com.feng.custom.algorithms.simple;

/**
 * 将数字变成0的操作次数: https://leetcode-cn.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 * 1. 右移一位表示除法, 与-2求与表示减法。
 * 2. 将数字转换为2进制, 有m位, 表示需要做m-1次除法(最后一位不需要), 有n个1表示需要做n次减法, 即m+n-1。
 */
public class NumberOfStepsToReduceANumberToZero_1342 {

    public int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & 1) == 0) {
                num = num >> 1;
            } else {
                num = num & -2;
            }
            count++;
        }
        return count;
    }

    public int numberOfSteps2(int num) {
        String s = Integer.toBinaryString(num);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ('1' == s.charAt(i)) {
                count++;
            }
        }
        return s.length() + count - 1;
    }
}
