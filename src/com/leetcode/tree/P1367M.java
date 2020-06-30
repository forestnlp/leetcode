package com.leetcode.tree;

public class P1367M {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
      /*  public boolean isSubPath(ListNode head, TreeNode root) {

            if(root.val==head.val)
                return helper(head.next,root.left)||helper(head.next,root.right);
            else
                return helper(head,root.left)||helper(head,root.right);
        }

        public boolean helper(ListNode head,TreeNode root) {
            if(root==null)
                return head==null;
            if(head==null) return true;

            if(root.val==head.val)
                return helper(head.next,root.left)||helper(head.next,root.right);
            else
                return helper(head,root.left)||helper(head,root.right);
        }*/
    }
}
