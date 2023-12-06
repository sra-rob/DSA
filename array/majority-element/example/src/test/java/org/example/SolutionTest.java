package org.example;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName("Majority element test")
public class SolutionTest {
    @Test
    @DisplayName("When array is null")
    public void testMajorityElement_withNullArray_throwsIllegalArgumentException() {
        int[] nums = null;
        Assertions.assertThatThrownBy(() -> {
            Solution.majorityElement(nums);
        }).isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    @DisplayName("When array is empty")
    public void testMajorityElement_withEmptyArray_returnsIllegalArugmentException() {
        int[] nums = {};
        Assertions.assertThatThrownBy(() -> {
            Solution.majorityElement(nums);
        }).isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    @DisplayName("Valid input returns solution")
    public void testMajorityElement_withValidArgument_returnsSolution() {
        int[] nums = { 1, 1, 1, 1, 2, 2 };
        int majorityElement = Solution.majorityElement(nums);
        Assertions.assertThat(majorityElement).isEqualTo(1);
    }
}
