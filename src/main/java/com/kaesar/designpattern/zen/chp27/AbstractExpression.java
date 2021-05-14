package com.kaesar.designpattern.zen.chp27;

import com.kaesar.designpattern.zen.chp26.Context;

/**
 * @Author: chengk
 * @Date: 2021/4/27 10:36 下午
 */
public abstract class AbstractExpression {
    // 每个表达式必须有一个解析任务
    public abstract Object interpreter(Context context);
}
