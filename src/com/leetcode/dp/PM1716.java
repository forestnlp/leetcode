package com.leetcode.dp;

public class PM1716 {
    class Solution {
        public int massage(int[] nums) {
            if(nums==null||nums.length==0) return 0;
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            if(nums.length==1) return dp[0];
            dp[1] = Math.max(nums[0],nums[1]);
            for(int i=2;i<nums.length;i++) {
                dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
            }
            return dp[dp.length-1];
        }
    }
}