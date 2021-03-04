package com.kaesar.designpattern.zen.chp18;

/**
 * 策略枚举
 */
public enum CalculatorEnum {
    // 加法运算
    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },
    SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };

    String value = "";

    // 定义成员值类型
    private CalculatorEnum(String _value) {
        this.value = _value;
    }

    // 获得枚举成员的值
    public String getValue() {
        return this.value;
    }

    // 生命一个抽象函数
    public abstract int exec(int a, int b);
}
