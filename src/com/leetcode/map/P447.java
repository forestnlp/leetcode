package com.leetcode.map;

import java.util.HashMap;
import java.util.Map;

public class P447 {
    class Solution {
        public int numberOfBoomerangs(int[][] points) {
            Map<Integer,Integer> map = new HashMap<>();
            for(int[] p:points) {
                for(int[] q:points) {
                    if(p[0]==q[0]&&p[1]==q[1]) continue;
                    int dis = distance(p,q);
                    map.put(dis,map.getOrDefault(dis,0)+1);
                }
            }

            int ans = 0;
            for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
                ans+=entry.getValue()*(entry.getKey()-1);
            }

            return ans;
        }

        private int distance(int[] p,int[] q) {
            return (p[0]-q[0])*(p[0]-q[0])+(p[1]-q[1])*(p[1]-q[1]);
        }
    }
}
