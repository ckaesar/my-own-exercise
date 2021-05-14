package com.kaesar.designpattern.zen.chp27;

import com.kaesar.designpattern.zen.chp26.Context;

/**
 * @Author: chengk
 * @Date: 2021/4/27 10:38 下午
 */
public class TerminalExpression extends AbstractExpression {
    // 通常终结符表达式只有一个，但是有多个对象
    @Override
    public Object interpreter(Context context) {
        return null;
    }
}
