package com.kaesar.designpattern.zen.chp38;

/**
 * 与规格书
 *
 * @Author: chengk
 * @Date: 2021/6/13 2:03 下午
 */
public class NotSpecification2 extends AbstractCompositeSpecification {
    // 传递两个规格书进行and操作
    private ISpecification spec;

    public NotSpecification2(ISpecification spec) {
        this.spec = spec;
    }

    // 进行and运算
    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return !spec.isSatisfiedBy(candidate);
    }
}
