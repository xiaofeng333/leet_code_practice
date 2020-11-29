package com.feng.custom.algorithms.simple;

import java.util.Arrays;

/**
 * 三角形的最大周长: https://leetcode-cn.com/problems/largest-perimeter-triangle/
 * 贪心(https://baike.baidu.com/item/%E8%B4%AA%E5%BF%83%E7%AE%97%E6%B3%95/5411800?fr=aladdin) + 排序
 * 贪心算法是指在对问题进行求解时, 总是做出在当前看来是最好的选择。
 */
public class LargestPerimeterTriangle_976 {

    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; i--) {
            if (A[i - 1] + A[i - 2] > A[i]) {
                return A[i - 1] + A[i - 2] + A[i];
            }
        }
        return 0;
    }
}
