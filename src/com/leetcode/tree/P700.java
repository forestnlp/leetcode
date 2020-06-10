package com.leetcode.tree;

public class P700 {
    class Solution {
        public TreeNode searchBST(TreeNode root, int val) {

            if(root==null) return null;

            if(root.val<val) return searchBST(root.right,val);

            else if(root.val>val) return searchBST(root.left,val);

            else return root;
        }
    }
}
