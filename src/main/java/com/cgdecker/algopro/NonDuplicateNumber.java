package com.cgdecker.algopro;

import java.util.HashMap;
import java.util.Map;

public class NonDuplicateNumber {
    
        public static void main(String[] args) {
            // System.out.println(singleNumber(new int[]{4, 3, 2, 4, 1, 3, 2}));
            // System.out.println(singleNumber2(new int[]{4, 3, 2, 4, 1, 3, 2}));
            System.out.println(singleNumber2(new int[]{1, 1, 2, 2, 3, 3,4, 5,4,5}));
    }

    private static int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        for(int i: nums){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        return map.entrySet()
        .stream()
        .filter(e -> e.getValue() == 1).findFirst().map(e -> e.getKey()).get();

    }
    public static int singleNumber2(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result ^= i;
            // System.out.println(result);
        }
        return result;
    }
}