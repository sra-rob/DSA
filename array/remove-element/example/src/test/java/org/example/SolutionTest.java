package org.example;

import org.example.exception.RemoveElementArrayIsNull;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void RemoveElement_ArrayIsEmpty_ReturnsZero() {
        int[] nums = {};
        int value = 3;
        int count = Solution.removeElement(nums, value);
        assertEquals(0, count);
    }
    @Test
    public void RemoveElement_ArrayIsNull_ThrowsException() {
        int[] nums = null;
        int value = 3;
        assertThrows(RemoveElementArrayIsNull.class, () -> {
            int count = Solution.removeElement(nums, value);
        });
    }
    @Test
    public void RemoveElement_AllElementsAreValue_ReturnsZero() {
        int[] nums = { 3, 3, 3 };
        int value = 3;
        int count = Solution.removeElement(nums, value);
        assertEquals(0, count);
    }
}
