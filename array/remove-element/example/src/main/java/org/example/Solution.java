package org.example;

import org.example.exception.RemoveElementArrayIsNull;

public class Solution {
    private Solution(){}
    public static int removeElement(int[] nums, int val) {
        if(nums == null) {
            throw new RemoveElementArrayIsNull();
        }
        int start = 0;
        int end = nums.length - 1;
        int count = 0;
        while(start <= end) {
            if(nums[start] == val) {
                int temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;
                end--;
            } else {
                start++;
                count++;
            }
        }
        return count;
    }
}
