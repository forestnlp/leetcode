package com.leetcode.string;

public class PM0103 {
    class Solution {
        public String replaceSpaces(String S, int length) {
            char [] array = S.toCharArray();
            int j = S.length()-1;
            for(int i=length-1;i>=0;i--) {
                if(array[i]==' '){
                    array[j--]='0';
                    array[j--]='2';
                    array[j--]='%';
                }
                else {
                    array[j--] = array[i];
                }
            }
            return String.valueOf(array,j+1,S.length()-j-1);
        }
    }
}
