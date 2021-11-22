package com.feng.custom.algorithms.simple;

import java.util.List;

/**
 * N叉树的最大深度: https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree/
 * 题解: https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree/solution/n-cha-shu-de-zui-da-shen-du-by-leetcode-n7qtv/
 */
public class MaximumDepthOfNAryTree_559 {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int maxDepthLevel = 0;
        for (Node node : root.children) {
            int childrenLevel = maxDepth(node);
            if (childrenLevel > maxDepthLevel) {
                maxDepthLevel = childrenLevel;
            }
        }
        return maxDepthLevel + 1;
    }

}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}