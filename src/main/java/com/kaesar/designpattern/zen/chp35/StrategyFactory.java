package com.kaesar.designpattern.zen.chp35;

/**
 * 策略工厂
 *
 * @Author: chengk
 * @Date: 2021/6/7 6:38 上午
 */
public class StrategyFactory {
    // 策略工厂
    public static IDeduction getDeduction(StrategyMan strategy) {
        IDeduction deduction = null;
        try {
            deduction = (IDeduction) Class.forName(strategy.getValue()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deduction;
    }
}
