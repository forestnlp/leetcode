package com.leetcode.tree;

import java.util.List;

public class P559 {

    class Solution {
        public int maxDepth(Node root) {
            if(root==null) return 0;
            int maxDepth = 0;
            for(Node n:root.children) {
                int temp =maxDepth(n);
                if(temp>maxDepth)
                    maxDepth=temp;
            }
            return maxDepth+1;
        }
    }
}
