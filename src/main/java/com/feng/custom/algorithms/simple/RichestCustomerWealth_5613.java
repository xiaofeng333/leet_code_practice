package com.feng.custom.algorithms.simple;

/**
 * 最富有客户的资产总量: https://leetcode-cn.com/problems/richest-customer-wealth/
 */
public class RichestCustomerWealth_5613 {

    public int maximumWealth(int[][] accounts) {
        int res = 0;
        int cur = 0;
        for (int i = 0; i < accounts.length; i++) {
            cur = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                cur += accounts[i][j];
            }
            res = Math.max(cur, res);
        }
        return res;
    }
}
