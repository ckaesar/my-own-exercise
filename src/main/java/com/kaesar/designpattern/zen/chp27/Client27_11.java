package com.kaesar.designpattern.zen.chp27;

import com.kaesar.algorithm4.exercise.chp1.Stack;
import com.kaesar.designpattern.zen.chp26.Context;

/**
 * @Author: chengk
 * @Date: 2021/4/27 11:07 下午
 */
public class Client27_11 {
    public static void main(String[] args) {
        Context ctx = new Context();
        // 通常定一个语法容器，容纳一个具体的表达式，通常为ListArray、LinkedList、Stack等类型
        Stack<AbstractExpression> stack = new Stack<>();
        for (; ; ) {
            // 进行语法判断，并产生递归调用
            break;
        }
        // 产生一个完整的语法树，由各个具体的语法分析进行解析
        AbstractExpression exp = stack.pop();
        // 具体元素进入场景
        exp.interpreter(ctx);
    }
}
