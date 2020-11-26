package com.feng.custom.algorithms.simple;

/**
 * 删除中间节点: https://leetcode-cn.com/problems/delete-middle-node-lcci/
 */
public class DeleteMiddleNode_02_03 {

    /**
     * 评论说的很好, 杀不死你, 我就变成后面的你, 然后替换你。
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
