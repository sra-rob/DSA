package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SolutionTest {
    @Test
    public void ReverseString_StringIsNull_ThrowsIllegalArgumentException() {
        String s = null;
        assertThrows(IllegalArgumentException.class, () -> {
            Solution.reverseString(s);
        });
    }
    @Test
    public void ReverseString_StringIsEmpty_ReturnsEmpty() {
        String s = "";
        String actual = Solution.reverseString(s);
        assertEquals(s, actual);
    }
}
