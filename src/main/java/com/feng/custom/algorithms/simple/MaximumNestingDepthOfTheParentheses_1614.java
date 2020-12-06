package com.feng.custom.algorithms.simple;

/**
 * 括号的最大嵌套深度: https://leetcode-cn.com/problems/maximum-nesting-depth-of-the-parentheses/
 */
public class MaximumNestingDepthOfTheParentheses_1614 {

    public int maxDepth(String s) {
        int res = 0, max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                max++;
            } else if (s.charAt(i) == ')') {
                max--;
            }
            res = Math.max(res, max);
        }
        return res;
    }
}
