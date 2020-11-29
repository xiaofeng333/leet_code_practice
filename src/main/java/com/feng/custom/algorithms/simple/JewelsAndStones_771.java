package com.feng.custom.algorithms.simple;

import java.util.HashSet;
import java.util.Set;

/**
 * 宝石与石头: https://leetcode-cn.com/problems/jewels-and-stones/
 * 亦可维护一个数组代替set
 */
public class JewelsAndStones_771 {

    public int numJewelsInStones(String J, String S) {
        Set<Character> jSet = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            jSet.add(J.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (jSet.contains(S.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
