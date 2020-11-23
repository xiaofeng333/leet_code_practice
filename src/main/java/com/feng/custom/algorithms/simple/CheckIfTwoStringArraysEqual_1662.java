package com.feng.custom.algorithms.simple;

/**
 * 检查两个字符串数组是否相等: https://leetcode-cn.com/problems/check-if-two-string-arrays-are-equivalent/
 * 考点: 字符串拼接+字符串之间的值判断
 * String.join内部使用了StringBuilder
 */
public class CheckIfTwoStringArraysEqual_1662 {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }
}
