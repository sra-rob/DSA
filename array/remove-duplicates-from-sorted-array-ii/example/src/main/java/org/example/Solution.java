package org.example;

public class Solution {
    private Solution(){}
    public static int removeDuplicates(int[] nums) {
        if(nums == null) {
            throw new IllegalArgumentException("Arrays nums cannot be null");
        }
        int start = 0;
        for(int num: nums) {
            if(start == 0 || start == 1 || num != nums[start - 2]) {
                nums[start] = num;
                start++;
            }
        }
        return start;
    }
}
