package com.leetcode.tree;

/**
 * Created by mac on 2020/6/6.
 */


/**
 * 考虑对BST中序遍历会产生有序数列。
 * 如果对BST逆中序，则产生逆序数列。
 * */
class Solution {

    int num = 0;

    public TreeNode convertBST(TreeNode root) {

        if(root==null) return null;

        root.right = convertBST(root.right);

        root.val += num;

        num = root.val;

        root.left = convertBST(root.left);

        return root;
    }

}