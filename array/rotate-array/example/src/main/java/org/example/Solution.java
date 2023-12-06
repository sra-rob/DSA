package org.example;

public class Solution {
    private Solution(){}
    public static void rotate(int[] nums, int k) {
        if(nums == null) {
            throw new IllegalArgumentException("Array nums cannot be null");
        }
        if(k < 0) {
            throw new IllegalArgumentException("Int k cannot be negative");
        }
        int numsLen = nums.length;
        int[] ans = new int[numsLen];
        for(int i = 0; i < nums.length; i++) {
            ans[(i + k) % numsLen] = nums[i];
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i] = ans[i];
        }
    }
}
