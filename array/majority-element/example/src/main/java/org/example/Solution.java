package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Solution(){}
    public static int majorityElement(int[] nums) {
        if(nums == null) {
            throw new IllegalArgumentException("Array nums cannot be null");
        }
        if(nums.length == 0) {
            throw new IllegalArgumentException("Array nums must have at least one element");
        }
        Map<Integer, Integer> elementCount = new HashMap();
        for(int num: nums) {
            if(!elementCount.containsKey(num)) {
                elementCount.put(num, 0);
            }
            int currCount = elementCount.get(num);
            elementCount.put(num, currCount + 1);
        }
        for(Map.Entry<Integer, Integer> entry: elementCount.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(value > (nums.length / 2)) {
                return key;
            }
        }
        return -1;
    }
}
