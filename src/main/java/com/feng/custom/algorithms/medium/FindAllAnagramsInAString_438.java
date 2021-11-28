package com.feng.custom.algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 找到字符串中所有字母异位词: https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/
 */
public class FindAllAnagramsInAString_438 {

    public List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length(), pLen = p.length();
        if (sLen < p.length()) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        int[] sArr = new int[26];
        int[] pArr = new int[26];
        for (int i = 0; i < pLen; i++) {
            ++sArr[s.charAt(i) - 'a'];
            ++pArr[p.charAt(i) - 'a'];
        }
        if (Arrays.equals(sArr, pArr)) {
            result.add(0);
        }
        for (int i = 0; i < sLen - pLen; i++) {
            --sArr[s.charAt(i) - 'a'];
            ++sArr[s.charAt(i + pLen) - 'a'];
            if (Arrays.equals(sArr, pArr)) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
