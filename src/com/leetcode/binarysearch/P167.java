package com.leetcode.binarysearch;

public class P167 {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int i=0,j=numbers.length-1;
            while (true) {
                int sum = numbers[i] + numbers[j];
                if(sum==target) return new int[] {i+1,j+1};
                else if(sum>target) j--;
                else i++;
            }
        }
    }
}
