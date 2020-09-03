package com.leetcode.heap;

import java.util.PriorityQueue;

public class PM1709 {
    class Solution {
        public int getKthMagicNumber(int k) {
            if(k==1) return 1;
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            return 0;
        }
    }

    public static void main(String[] args) {
        PM1709.Solution solution = new PM1709().new Solution();
        int res = solution.getKthMagicNumber(2);
        System.out.println(res);
    }
}
