package com.kaesar.designpattern.zen.chp27;

import java.util.HashMap;

/**
 * 减法解析器
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    // 左右两个表达式相减
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
