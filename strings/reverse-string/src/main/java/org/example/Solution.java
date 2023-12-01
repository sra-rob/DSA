package org.example;

public class Solution {
    private String s;
    private Solution() {}
    public static String reverseString(String s) {
        char[] charArr = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(charArr);
    }
}
