package com.kaesar.sword2offer;

/**
 * 标题：股票的最大利润
 * 可以有一次买入和一次卖出，买入必须在前。求最大收益。
 * 例子：题目描述 [7, 1, 5, 3, 6, 4]
 * 最大利润为 6 - 1 = 5
 */
public class Jz75 {


  /**
   * 使用贪心策略，假设第 i 轮进行卖出操作，买入操作价格应该在 i 之前并且价格最低。
   */
  public int maxProfit(int[] prices) {
    if (prices == null || prices.length == 0) {
      return 0;
    }
    int soFarMin = prices[0];
    int maxProfit = 0;
    for (int i = 1; i < prices.length; i++) {
      soFarMin = Math.min(soFarMin, prices[i]);
      maxProfit = Math.max(maxProfit, prices[i] - soFarMin);
    }
    return maxProfit;
  }
}
