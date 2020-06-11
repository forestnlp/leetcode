package com.leetcode.tree;

public class Pm0402 {

    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {

            if(nums==null) return null;

            TreeNode root = centreNode(nums,0,nums.length-1);

            return root;
        }

        public TreeNode centreNode(int [] nums,int start,int end) {
            return null;
        }

    }
}
