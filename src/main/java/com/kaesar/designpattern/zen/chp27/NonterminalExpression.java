package com.kaesar.designpattern.zen.chp27;

import com.kaesar.designpattern.zen.chp26.Context;

/**
 * @Author: chengk
 * @Date: 2021/4/27 11:04 下午
 */
public class NonterminalExpression extends AbstractExpression {
    // 每个非终结符表达式都会对其他表达式产生依赖
    public NonterminalExpression(AbstractExpression... abstractExpressions) {

    }

    @Override
    public Object interpreter(Context context) {
        // 进行文法处理
        return null;
    }
}
