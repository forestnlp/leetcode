package com.leetcode.binarysearch;

public class P240M {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {

        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 20;
        boolean b = new P240M().new Solution().searchMatrix(matrix,target);
        System.out.println(b);
    }
}

