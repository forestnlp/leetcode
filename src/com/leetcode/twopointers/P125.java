package com.leetcode.twopointers;

public class P125 {
    class Solution {
        public boolean isPalindrome(String s) {
            if(s.equals("")||s.trim().equals("")) return true;
            int left = 0, right = s.length() - 1;
            while (left <= right) {
                while (!Character.isLetterOrDigit(s.charAt(left))&&left<s.length()) left++;
                while (!Character.isLetterOrDigit(s.charAt(right))&&right>0) right--;
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                    return false;
                else {
                    left++;
                    right--;
                }
            }
            return true;
        }
    }
}
