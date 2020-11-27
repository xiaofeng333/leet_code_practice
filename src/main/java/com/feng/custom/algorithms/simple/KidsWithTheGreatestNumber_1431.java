package com.feng.custom.algorithms.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 拥有最多糖果的孩子: https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/
 */
public class KidsWithTheGreatestNumber_1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            res.add(candies[i] + extraCandies >= max);
        }
        return res;
    }
}
