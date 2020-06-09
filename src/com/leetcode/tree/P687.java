package com.leetcode.tree;

public class P687 {
    class Solution {

        public int longestUnivaluePath(TreeNode root) {
            if (root == null) return 0;
            TreeNode left = root.left;
            TreeNode right = root.right;

            int leftDis = helper(left,root.val);
            int rightDis = helper(right,root.val);

            if (left != null && root.val == left.val)
                leftDis += 1;
            if (right != null && root.val == right.val)
                rightDis += 1;

            return Math.max(leftDis,rightDis);
        }

        public int helper(TreeNode node,int val) {
            if(node==null) return 0;
            TreeNode left = node.left;
            TreeNode right = node.right;

            int a=0,b=0;

            if(left!=null)
                if(left.val==node.val)
                    a = helper(node.left,val)+1;
                else
                    a = helper(node.left,node.left.val);

            if(right!=null&&right.val==node.val)
                if(right.val==node.val)
                    b = helper(node.right,val)+1;
                else
                    b = helper(node.right,node.right.val);

            return Math.max(a,b);
        }
    }
}
