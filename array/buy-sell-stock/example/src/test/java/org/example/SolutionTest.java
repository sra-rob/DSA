package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Max profit test")
public class SolutionTest {
    @Test
    @DisplayName("Null array throws IllegalArgumentException")
    public void testMaxProfit_whenArrayIsNull_throwsIllegalArgumentExeception() {
        int[] nums = null;
        Assertions.assertThatThrownBy(() -> {
            Solution.maxProfit(nums);
        }).isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    @DisplayName("Empty array returns 0")
    public void testMaxProfit_whenArrayIsEmpty_returnsZero() {
        int[] nums = {};
        Assertions.assertThat(Solution.maxProfit(nums)).isEqualTo(0);
    }
    @Test
    @DisplayName("Valid arguments returns solution")
    public void testMaxProfit_whenArgumentsArValid_returnsSolution() {
        int[] nums = {1, 2, 3};
        Assertions.assertThat(Solution.maxProfit(nums)).isEqualTo(2);
    }
    @Test
    @DisplayName("Elements are descending")
    public void testMaxProfit_whenElementsAreDescending_returnsZero() {
        int[] nums = { 3, 2, 1 };
        Assertions.assertThat(Solution.maxProfit(nums)).isEqualTo(0);
    }
}
