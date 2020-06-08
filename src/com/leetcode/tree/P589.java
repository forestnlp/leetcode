package com.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class P589 {

    class Solution {

        List<Integer> ls_travel = new ArrayList<>();

        public List<Integer> preorder(Node root) {
            helper(root);
            return ls_travel;
        }

        public void helper(Node node) {
            if(node==null) return;
            ls_travel.add(node.val);

            for(Node child:node.children) {
                helper(child);
            }
        }
    }

}
