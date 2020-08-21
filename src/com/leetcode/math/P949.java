package com.leetcode.math;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P949 {
    class Solution {
        public String largestTimeFromDigits(int[] A) {
            List list = Arrays.asList(A);
            Collections.sort(list);
            if((Integer)list.get(0)>2) return "";
            return "";
        }
    }
}
