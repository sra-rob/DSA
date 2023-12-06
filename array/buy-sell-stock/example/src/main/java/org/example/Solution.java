package org.example;

public class Solution {
    private Solution(){}
    public static int maxProfit(int[] prices) {
        if(prices == null) {
            throw new IllegalArgumentException("Arrays prices cannot be null");
        }
        if(prices.length == 0) return 0;
        int minStockPrice = prices[0];
        int maxProfit = Integer.MIN_VALUE;
        for(int i = 1; i < prices.length; i++) {
            int currStockPrice = prices[i];
            int currProfit = currStockPrice - minStockPrice;
            maxProfit = Math.max(maxProfit, currProfit);
            minStockPrice = Math.min(minStockPrice, currStockPrice);
        }
        return maxProfit < 0 ? 0 : maxProfit;
    }
}
