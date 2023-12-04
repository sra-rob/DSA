package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SolutionTest {
    @Test
    public void LongestSubstringWithoutRepeatingCharacters_StringIsNull_ThrowsIllegalArgumentException() {
        String s = null;
        assertThrows(IllegalArgumentException.class, () -> {
           Solution.longestSubstringWithoutRepeatingCharacters(s);
        });
    }
    @Test
    public void LongestSubstringWithoutRepeatingCharacters_StringIsEmpty_Returns0() {
        String s = "";
        int expected = 0;
        int actual = Solution.longestSubstringWithoutRepeatingCharacters(s);
        assertEquals(expected, actual);
    }
}
