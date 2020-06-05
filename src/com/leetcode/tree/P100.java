package com.leetcode.tree;

public class P100 {
    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p==null&&q==null) return true;
            if(p==null||q==null) return false;
            else return (p.val==q.val)&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }
    }
}
