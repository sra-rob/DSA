package org.example;

import org.example.exception.LengthIsLargerThanArrayException;

class Solution {
    private Solution(){}
    public static void mergeSortedArrays(int[] nums1, int m, int[] nums2, int n) {
        if(nums1 == null || nums2 == null) {
            throw new IllegalArgumentException("int[] cannot be null");
        }
        if(m > nums1.length || n > nums2.length) {
            throw new LengthIsLargerThanArrayException();
        }
        if(n == 0) return;
        if(m == 0) {
            for(int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        int end = (m + n) - 1;
        int mLen = ((m + n) - n) - 1;
        int nLen = n - 1;
        while(mLen >= 0 && nLen >= 0) {
            if(nums1[mLen] >= nums2[nLen]) {
                nums1[end] = nums1[mLen];
                mLen--;
            } else {
                nums1[end] = nums2[nLen];
                nLen--;
            }
            end--;
        }
        while(mLen >= 0) {
            nums1[end] = nums1[mLen];
            mLen--;
            end--;
        }
        while(nLen >= 0) {
            nums1[end] = nums2[nLen];
            nLen--;
            end--;
        }
    }
}