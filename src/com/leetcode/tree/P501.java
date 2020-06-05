package com.leetcode.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P501 {

    class Solution {

        int occurCurTimes = 1;
        int occurMaxTimes = 1;

        TreeNode preNode = null;

        List<TreeNode> res = new ArrayList<>();

        public int[] findMode(TreeNode root) {
            InOrderTravel(root);
            int[] modes = new int[res.size()];
            for (int i = 0; i < res.size(); i++) {
                modes[i] = res.get(i).val;
            }
            return modes;
        }

        public void InOrderTravel(TreeNode node) {

            if (node == null) return;
            InOrderTravel(node.left);
            if (preNode != null) {
                if (node.val == preNode.val) {
                    occurCurTimes++;
                }
                else {
                    if (occurCurTimes == occurMaxTimes) {
                        res.add(node);
                    }
                    else if (occurCurTimes > occurMaxTimes) {
                        occurMaxTimes = occurCurTimes;
                        res.clear();
                        res.add(node);
                    }
                    occurCurTimes = 1;
                }
            }
            preNode = node;
            InOrderTravel(node.right);
        }
    }
}
