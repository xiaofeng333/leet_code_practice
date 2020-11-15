package com.feng.custom.algorithms;

/**
 * 判定字符是否唯一: https://leetcode-cn.com/problems/is-unique-lcci/
 * 解: 注意字符串的字符范围。
 * 26个小写英文字母, 一开头直接判断如果字符长度>26, 直接返回False。
 * 对于ascii字符集, 然后他的代码里有边界检查, 并且针对不同的范围有不同的侧重点, 比如说ascii字符集, 那也就是128个可能性, 16个字节的位运算比较好(定义一个int类型数组, 该位不为0标识已存在)。
 * 如果是unicode, 没有字符范围, 排序后再判断。
 */
public class IsUniqueStr {

    /**
     * 对于全是小写字母的字符串判断
     */
    public boolean isUnique(String astr) {
        if (astr.length() > 26) {
            return false;
        }
        int mark = 0;
        int cur;
        for (int i = 0; i < astr.length(); i++) {
            cur = 1 << (astr.charAt(i) - 'a');
            if ((mark & cur) != 0) {
                return false;
            } else {
                mark = mark | cur;
            }
        }
        return true;
    }
}
