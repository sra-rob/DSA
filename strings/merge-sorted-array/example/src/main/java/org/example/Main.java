package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = { 1, 3, 5, 0, 0, 0};
        int[] nums2 = { 2, 3, 9};
        int m = 3;
        int n = 3;
        Solution.mergeSortedArrays(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}