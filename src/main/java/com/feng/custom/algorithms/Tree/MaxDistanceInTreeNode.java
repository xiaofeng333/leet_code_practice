package com.feng.custom.algorithms.Tree;

/**
 * 二叉树节点间的最大距离问题
 * 从二叉树的节点A出发, 可以向上或者向下走, 但沿途的节点只能经过一次, 当到达节点B时,
 * 路径上的节点数叫作A到B的距离。
 * 现在给出一棵二叉树, 求整棵树上每对节点之间的最大距离。
 */
public class MaxDistanceInTreeNode {

    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        head.left.left = new TreeNode(4);
        head.left.right = new TreeNode(5);
        head.left.left.left = new TreeNode(6);
        head.left.left.right = new TreeNode(7);
        head.left.right.left = new TreeNode(8);
        head.left.right.right = new TreeNode(9);
        head.left.right.right.right = new TreeNode(10);
        head.left.right.right.right.right = new TreeNode(11);
        System.out.println(new MaxDistanceInTreeNode().getMaxDistance(head));
    }

    public int getMaxDistance(TreeNode root) {
        int[] pos = new int[1];
        return posOrder(root, pos);
    }

    /**
     * pos存储最大左子树路径或最大右子树路径。
     * 返回的是当前节点的最大路径。
     */
    private int posOrder(TreeNode root, int[] pos) {
        if (root == null) {
            pos[0] = 0;
            return 0;
        }
        int left = posOrder(root.left, pos);
        int maxLeft = pos[0];
        int right = posOrder(root.right, pos);
        int maxRight = pos[0];
        int curNodeMax = maxLeft + maxRight + 1;
        pos[0] = Math.max(maxLeft, maxRight) + 1;
        return Math.max(Math.max(left, right), curNodeMax);
    }
}
