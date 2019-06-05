package com.study.question;

/**
 * @Auther: zhant
 * @Date: 2019/6/5/0005 16:53
 * @Description:
 */
public class addTwoNumbers_02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode p1 = l1, p2 = l2, curry = node;
        int carry = 0;
        while (p1 != null || p2 != null) {
            int x = (p1 != null) ? p1.val : 0;
            int y = (p2 != null) ? p2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curry.next = new ListNode(sum%10);
            curry = curry.next;
            if (p1 != null) {
                p1 = p1.next;
            }
            if (p2 != null) {
                p2 = p2.next;
            }
        }
        if(carry > 0){
            curry.next = new ListNode(carry);
        }
        return node.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
