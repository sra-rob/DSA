package org.example;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Solution(){}
    public static int longestSubstringWithoutRepeatingCharacters(String s) {
        if(s.length() == 0) return 0;
        Map<Character, Integer> characterCount = new HashMap<>(Map.of(s.charAt(0), 1));
        int maxCount = 1;
        int currCount = 1;
        int left = 0;
        int right = 1;
        while(right < s.length()) {
            char currChar = s.charAt(right);
            if(!characterCount.containsKey(currChar)) {
                characterCount.put(currChar, 0);
            } else {
                while(characterCount.get(currChar) > 0) {
                    char leftChar = s.charAt(left);
                    int leftCount = characterCount.get(leftChar);
                    characterCount.put(leftChar, leftCount - 1);
                    left++;
                    currCount--;
                }
            }
            int rightCount = characterCount.get(currChar) + 1;
            characterCount.put(currChar, rightCount);
            currCount++;
            maxCount = Math.max(maxCount, currCount);
            right++;
        }
        return maxCount;
    }
}
