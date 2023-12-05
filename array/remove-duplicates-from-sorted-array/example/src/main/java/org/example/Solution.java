package org.example;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    private Solution() {}
    public static int removeDuplicates(int[] nums) {
        if(nums == null) {
            throw new IllegalArgumentException("Array nums cannot be null");
        }
        if(nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        int start = 1;
        for(int end = 1; end < nums.length; end++) {
            if(nums[end] != nums[end - 1]) {
                nums[start] = nums[end];
                start++;
            }
        }
        return start;
    }
}
