package com.leetcode.string;

public class P1422 {
    class Solution {
        public int maxScore(String s) {

            int cnt1=0,score = 0;
            for(char c:s.toCharArray()) {
                if(c=='1') cnt1++;
            }

            int left=0,right=cnt1;
            for (int i = 0; i < s.length()-1; i++) {
                if(s.charAt(i)=='0') {
                    left++;
                }
                else {
                    right--;
                }
                score = Math.max(score,left+right);
            }
            return score;
        }
    }
}
