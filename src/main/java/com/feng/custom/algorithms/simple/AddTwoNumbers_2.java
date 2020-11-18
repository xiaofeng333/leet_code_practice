package com.feng.custom.algorithms.simple;

/**
 * 两数相加: https://leetcode-cn.com/problems/add-two-numbers/
 * 注意最后判断carry
 */
public class AddTwoNumbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(), tail = head;
        int sum, carry = 0, val1, val2;
        while (l1 != null || l2 != null) {
            val1 = (l1 == null) ? 0 : l1.val;
            val2 = (l2 == null) ? 0 : l2.val;
            sum = val1 + val2 + carry;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            carry = sum / 10;
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head.next;
    }
}
