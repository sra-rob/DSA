package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Test solution implemented in the Solution class")
public class SolutionTest {
    @Test
    @DisplayName("Test with null array")
    public void testRemoveDuplicates_whenArrayIsNull_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Solution.removeDuplicates(null);
        });
    }
    @Test
    @DisplayName("Test with empty array")
    public void testRemoveDuplicates_whenArrayIsEmpty_returnNumberOfElementsInArray() {
        // Arrange
        int[] nums = {};
        int expected = 0;
        // Act
        int actual = Solution.removeDuplicates(nums);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Test with one element")
    public void testRemoveDuplicates_whenArrayHasOneElement_returnNumberOfElementsInArray() {
        // Arrange
        int[] nums = { 1 };
        int expected = 1;
        // Act
        int actual = Solution.removeDuplicates(nums);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Test with many same-value elements")
    public void testRemoveDuplicates_whenElementsAreTheSame_returnNumberOfElementsInArray() {
        // Arrange
        int[] nums = { 1,1,1,1 };
        int expected = 1;
        // Act
        int actual = Solution.removeDuplicates(nums);
        // Assert
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("Test with many unique elements")
    public void testRemoveDuplicates_whenElementsAreUnique_returnNumberOfElementsInArray() {
        // Arrange
        int[] nums = { 1, 2, 3, 4, 5 };
        int expected = 5;
        // Act
        int actual = Solution.removeDuplicates(nums);
        // Assert
        assertEquals(expected, actual);
    }
}
