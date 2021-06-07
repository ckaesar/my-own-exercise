package com.kaesar.designpattern.zen.chp35;

/**
 * 策略枚举
 *
 * @Author: chengk
 * @Date: 2021/6/7 6:34 上午
 */
public enum StrategyMan {
    SteadyDeduction("com.kaesar.designpattern.zen.chp35.SteadyDeduction"),
    FreeDeduction("com.kaesar.designpattern.zen.chp35.FreeDeduction");

    String value = "";

    private StrategyMan(String _value) {
        this.value = _value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
