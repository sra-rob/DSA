package org.example;

import org.example.exception.LengthIsLargerThanArrayException;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
public class SolutionTest {
    @Test
    public void MergeSortedArrays_Nums1IsNull_IllegalArgumentException() {
        int[] nums1 = null;
        int[] nums2 = {1, 2, 3};
        int m = 0;
        int n = 3;
        assertThrows(IllegalArgumentException.class, () -> {
           Solution.mergeSortedArrays(nums1, m, nums2, n);
        });
    }
    @Test
    public void MergeSortedArrays_Nums2IsNull_ThrowsIllegalArgumentException() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = null;
        int m = 0;
        int n = 3;
        assertThrows(IllegalArgumentException.class, () -> {
            Solution.mergeSortedArrays(nums1, m, nums2, n);
        });
    }
    @Test
    public void MergeSortedArrays_MIsLargerThanNums1Length_ThrowsLengthIsLargerThanArrayException() {
        int[] nums1 = {1, 2, 3};
        int m = 4;
        int[] nums2 = {1, 2, 3};
        int n = 3;
        assertThrows(LengthIsLargerThanArrayException.class, () -> {
           Solution.mergeSortedArrays(nums1, m, nums2, n);
        });
    }
    @Test
    public void MergeSortedArrays_NIsLargerThanNums2Length_ThrowsLengthIsLargerThanArrayException() {
        int[] nums1 = {1, 2, 3};
        int m = 3;
        int[] nums2 = {1, 2, 3};
        int n = 4;
        assertThrows(LengthIsLargerThanArrayException.class, () -> {
            Solution.mergeSortedArrays(nums1, m, nums2, n);
        });
    }
    @Test
    public void MergeSortedArrays_Nums1IsEmpty_ReturnsNum2() {
        int[] nums1 = {0, 0, 0};
        int m = 0;
        int[] nums2 = {4,5,6};
        int n = 3;
        int[] expected = {4, 5, 6};
        System.out.println(Arrays.toString(nums1));
        Solution.mergeSortedArrays(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }
    @Test
    public void MergeSortedArrays_Nums2IsEmpty_ReturnsNum1() {
        int[] nums1 = {1, 2, 3};
        int m = 3;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {1, 2, 3};
        Solution.mergeSortedArrays(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }
}
