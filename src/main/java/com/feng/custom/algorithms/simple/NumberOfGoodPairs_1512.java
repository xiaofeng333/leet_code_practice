package com.feng.custom.algorithms.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 好数对的数目: https://leetcode-cn.com/problems/number-of-good-pairs/
 * 题解: https://leetcode-cn.com/problems/number-of-good-pairs/solution/hao-shu-dui-de-shu-mu-by-leetcode-solution/
 * 思考题目本身的变形: https://leetcode-cn.com/problems/number-of-good-pairs/solution/zhe-gu-ji-shi-wo-xie-zen-yao-duo-ti-yi-lai-zui-dua/560906
 */
public class NumberOfGoodPairs_1512 {

    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i : nums) {
            int value = map.getOrDefault(i, 0);
            res += value;
            map.put(i, value + 1);
        }
        return res;
    }
}
