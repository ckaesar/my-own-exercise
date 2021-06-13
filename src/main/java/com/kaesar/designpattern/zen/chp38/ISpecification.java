package com.kaesar.designpattern.zen.chp38;

/**
 * 抽象规格书
 *
 * @Author: chengk
 * @Date: 2021/6/13 1:56 下午
 */
interface ISpecification {
    // 候选者是否满足要求
    boolean isSatisfiedBy(Object candidate);

    // and操作
    ISpecification and(ISpecification spec);

    // or操作
    ISpecification or(ISpecification spec);

    // not操作
    ISpecification not();
}
