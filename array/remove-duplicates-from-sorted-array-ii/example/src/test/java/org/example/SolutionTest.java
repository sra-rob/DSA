package org.example;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Test implemented solution from Solution class")
public class SolutionTest {
    @Test
    public void testRemoveDuplicates_whenArrayIsNull_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
           Solution.removeDuplicates(null);
        });
    }
    @Test
    public void testRemoveDuplicates_whenArrayIsEmpty_returnsLengthOfArray() {
        int[] nums = {};
        int expected = 0;
        int actual = Solution.removeDuplicates(nums);
        assertEquals(expected, actual);
    }
    @Test
    public void testRemoveDuplicates_whenManySameValueElementsInArray_returnsLengthOfArray() {
        int[] nums = { 1, 1, 1, 1, 1 };
        int expected = 2;
        int actual = Solution.removeDuplicates(nums);
        assertEquals(expected, actual);
    }
    @Test
    public void testRemoveDuplicates_whenManyUniqueElementsInArray_returnsLengthOfArray() {
        int[] nums = { 1, 2, 3, 4, 5 };
        int expected = 5;
        int actual = Solution.removeDuplicates(nums);
        assertEquals(expected, actual);
    }
}
