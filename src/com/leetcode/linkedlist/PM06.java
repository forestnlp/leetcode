package com.leetcode.linkedlist;

import java.util.Stack;

public class PM06 {
    class Solution {
        public int[] reversePrint(ListNode head) {
            Stack<Integer> stack = new Stack<>();
            while (head!=null) {
                stack.push(head.val);
                head = head.next;
            }
            int [] arr = new int[stack.size()];
            int i=0;
            while (!stack.isEmpty()) {
                arr[i] = stack.pop();
                i++;
            }
            return arr;
        }
    }
}
