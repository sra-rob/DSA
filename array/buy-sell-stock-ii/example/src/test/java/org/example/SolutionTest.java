package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test max profit")
public class SolutionTest {
    @Test
    @DisplayName("When array is descending")
    public void testMaxProfit_whenArrayIsDescending_returnsZero() {
        int[] nums = {3, 2, 1};
        Assertions.assertThat(Solution.maxProfit(nums)).isEqualTo(0);
    }
    @Test
    @DisplayName("When array is null")
    public void testMaxProfit_whenArrayIsNull_returnsZero() {
        int[] nums = null;
        Assertions.assertThat(Solution.maxProfit(nums)).isEqualTo(0);
    }
    @Test
    @DisplayName("When array is empty")
    public void testMaxProfit_whenArrayIsEmpty_returnsZero() {
        int[] nums = {};
        Assertions.assertThat(Solution.maxProfit(nums)).isEqualTo(0);
    }
    @Test
    @DisplayName("When arguments are valid")
    public void testMaxProfit_whenArguementsAreValid_returnsSolution() {
        int[] nums = { 1, 2, 4, 2 };
        Assertions.assertThat(Solution.maxProfit(nums)).isEqualTo(3);
    }
}
