package com.feng.custom.algorithms.simple;

/**
 * 亲密字符串: https://leetcode-cn.com/problems/buddy-strings/
 */
public class QinMiZiFuChuanByLeetcodeSolutionYyis_859 {

    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        if (s.equals(goal)) {
            if (s.length() > 26) {
                return true;
            } else {
                int[] count = new int[26];
                for (int i = 0; i < s.length(); i++) {
                    count[s.charAt(i) - 'a']++;
                    if (count[s.charAt(i) - 'a'] > 1) {
                        return true;
                    }
                }
                return false;
            }
        } else {
            int first = -1, second = -1;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    if (first == -1) {
                        first = i;
                    } else if (second == -1) {
                        second = i;
                    } else {
                        return false;
                    }
                }
            }
            return first != -1 && second != -1 && s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first);
        }
    }
}
