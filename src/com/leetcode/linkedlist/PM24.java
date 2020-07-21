package com.leetcode.linkedlist;

public class PM24 {
    class Solution {
        public ListNode reverseList(ListNode head) {
              ListNode dummy = new ListNode();
              while (head!=null) {

                  head = head.next;
              }
              return dummy.next;
        }
    }
}
