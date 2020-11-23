package com.feng.custom.algorithms.simple;

/**
 * 左旋转字符串: https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 * String.subString生成了新的String对象, 内部最终调用了System.arraycopy。
 */
public class ReverseLeftWords_offer_58 {

    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }
}
