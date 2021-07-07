package com.kaesar.leetcode;

public class LeetCode_121 {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int result = 0;
        int buyPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] == buyPrice) {
                continue;
            } else if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else {
                if (prices[i] - buyPrice > result) {
                    result = prices[i] - buyPrice;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
