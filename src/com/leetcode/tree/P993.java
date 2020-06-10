package com.leetcode.tree;

public class P993 {
    class Solution {
        public boolean isCousins(TreeNode root, int x, int y) {
            if (root == null) return false;

            return (hasChild(root.left, x) && hasChild(root.right, y)) || (hasChild(root.left, y) && hasChild(root.right, x)) || isCousins(root.left, x, y) || isCousins(root.right, x, y);
        }

        public boolean hasChild(TreeNode node, int val) {
            if (node == null) return false;

            if (node.left != null && node.left.val == val) return true;
            if (node.right != null && node.right.val == val) return true;

            return false;
        }
    }
}
