package com.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class P590 {
    class Solution {
        List<Integer> ls_travel = new ArrayList<>();
        public List<Integer> postorder(Node root) {
            helper(root);
            return ls_travel;
        }

        public void helper(Node node) {
            if(node==null) return;

            for(Node child:node.children) {
                helper(child);
            }
            ls_travel.add(node.val);
        }
    }
}
