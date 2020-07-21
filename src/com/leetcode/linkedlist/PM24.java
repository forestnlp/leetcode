package com.leetcode.linkedlist;

public class PM24 {
    class Solution {
        public ListNode reverseList(ListNode head) {
              ListNode dummy = new ListNode();
              while (head!=null) {
                  ListNode n = dummy.next;
                  dummy.next = head;
                  head.next = n;
                  head = head.next;
              }
              return dummy.next;
        }
    }
}
