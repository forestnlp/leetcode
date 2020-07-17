package com.leetcode.linkedlist;

public class P83 {
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode cur = head;
            while (cur!=null&&cur.next!=null) {
                if(cur.next.val==cur.val) {
                    cur.next = cur.next.next;
                }
                else
                    cur=cur.next;
            }
            return head;
        }
    }
}
