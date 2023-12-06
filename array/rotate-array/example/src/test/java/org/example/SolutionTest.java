package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName("Rotate array test")
public class SolutionTest {
    @Test
    @DisplayName("When array is null")
    public void testRotate_whenArrayIsNull_throwsIllegalArgumentException() {
        int[] nums = null;
        int k = 3;
        Assertions.assertThatThrownBy(() -> {
            Solution.rotate(nums, k);
        }).isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    @DisplayName("When array is empty returns solution")
    public void testRotate_whenArrayIsEmpty_returnsSolution() {
        int[] nums = {};
        int k = 3;
        Solution.rotate(nums, k);
        Assertions.assertThat(nums.length).isEqualTo(0);
    }
    @Test
    @DisplayName("When k is negative")
    public void testRotate_whenArrayKIsNegative_throwsIllegalArgumentException() {
        int[] nums = { 1, 2, 3 };
        int k = -1;
        Assertions.assertThatThrownBy(() -> {
            Solution.rotate(nums, k);
        }).isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    @DisplayName("When k is zero returns solution")
    public void testRotate_whenKIsZero_returnsSolution() {
        int[] nums = { 1, 2, 3 };
        int k = 0;
        Solution.rotate(nums, k);
        Assertions.assertThat(nums[0]).isEqualTo(1);
    }
    @Test
    @DisplayName("When valid arguments returns solution")
    public void testRotate_whenValidArguments_returnsSolution() {
        int[] nums = {1, 2, 3};
        int k = 1;
        Solution.rotate(nums, k);
        Assertions.assertThat(nums[0]).isEqualTo(3);
    }
}
