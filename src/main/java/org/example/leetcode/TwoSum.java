package org.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;

// return the index of the two numbers whose sum equals the target

public class TwoSum {
    public static void main(String[] args) {
        int[] twoSumResult = twoSum2(new int[]{0,4,3,0},0);
        System.out.println("TwoSumResult "+ Arrays.toString(twoSumResult));
    }

    // method 1

    public static int[] twoSum1(int[] num, int target){
        for(int i = 0; i <num.length ;i++){
            for(int j = i+1 ; j< num.length ; j++){
                if(num[i]+num[j]==target)
                    return new int[]{i,j};
            }
        }
        return new int[]{};
    }

    //method2
    public static int[] twoSum2(int[] num, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int complementary = target - num[i];
            if (map.containsKey(complementary))
                return new int[]{map.get(complementary), i};
            map.put(complementary, i);
        }
        return new int[]{};
    }
}
