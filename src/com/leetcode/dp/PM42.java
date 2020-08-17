package com.leetcode.dp;

public class PM42 {
    class Solution {
        public int maxSubArray(int[] nums) {
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            int ans = dp[0];
            for (int i = 1; i < dp.length; i++) {
                dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
                ans = Math.max(ans, dp[i]);
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        PM42.Solution solution = new PM42().new Solution();
        solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
    }
}
