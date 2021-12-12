package com.feng.custom.algorithms.simple;

/**
 * 转换成小写字母: https://leetcode-cn.com/problems/to-lower-case/
 */
public class ToLowerCase_709 {

    public String toLowerCase(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 65 && c <= 90) {
                c |= 32;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
