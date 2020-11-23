package com.feng.custom.algorithms.Tree;

/**
 * 平衡二叉树: https://leetcode-cn.com/problems/ping-heng-er-cha-shu-lcof/
 * 平衡二叉树又被称为AVL树, 且具有以下性质: 它是一棵空树或它的左右两个子树的高度差的绝对值不超过1,
 * 并且左右两个子树都是一棵平衡二叉树。
 * 后续遍历 + 剪枝(从底至顶)
 */
public class IsBalancedTree_offer_55 {

    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    public int recur(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = recur(root.left);
        if (left == -1) {
            return -1;
        }
        int right = recur(root.right);
        if (right == -1) {
            return -1;
        }
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}
