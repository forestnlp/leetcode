package com.leetcode.linkedlist;

public class PM0208M {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
     class Solution {
        public ListNode detectCycle(ListNode head) {

            ListNode slow = head,fast = head;
            while (fast!=null&&fast.next!=null) {
                fast = fast.next.next;
                slow = slow.next;
                if(slow == fast) {
                    ListNode start = head;
                    while (start!=slow) {
                        start = start.next;
                        slow = slow.next;
                    }
                    return start;
                }
            }
            return null;
        }
    }
}
