package com.feng.custom.algorithms.simple;

/**
 * 字符串相加: https://leetcode-cn.com/problems/add-strings/
 * 注意carry
 */
public class AddStrings_415 {

    public String addStrings(String num1, String num2) {
        if (num1 == null) {
            return num2;
        }
        if (num2 == null) {
            return num1;
        }
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int val1 = 0, val2 = 0, carry = 0, sum = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            val1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            val2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            sum = val1 + val2 + carry;
            sb.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        sb.reverse();
        return sb.toString();
    }
}
