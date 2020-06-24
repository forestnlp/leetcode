package com.leetcode.tree;

import java.util.*;

public class P662M {
    class Solution {
        public int widthOfBinaryTree(TreeNode root) {
            int maxwidth = 0;
            Queue<TreeNode> que = new LinkedList<>();
            que.offer(root);
            while (!que.isEmpty()) {
                int size = que.size();
                int start=-1,end=-1;
                for (int i = 0; i < size; i++) {
                    TreeNode node = que.poll();
                    que.offer(node == null ? null : node.left);
                    que.offer(node == null ? null : node.right);
                    if(node!=null){
                        if(start==-1) start=i;
                        if(end==-1||i>end) end=i;
                    }
                }
                if(maxwidth<end - start + 1)
                    maxwidth = end - start + 1;
            }
            return maxwidth;
        }
    }
}