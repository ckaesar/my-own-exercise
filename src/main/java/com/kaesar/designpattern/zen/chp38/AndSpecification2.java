package com.kaesar.designpattern.zen.chp38;

/**
 * 与规格书
 *
 * @Author: chengk
 * @Date: 2021/6/13 2:03 下午
 */
public class AndSpecification2 extends AbstractCompositeSpecification {
    // 传递两个规格书进行and操作
    private ISpecification left;
    private ISpecification right;

    public AndSpecification2(ISpecification left, ISpecification right) {
        this.left = left;
        this.right = right;
    }

    // 进行and运算
    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return left.isSatisfiedBy(candidate) && right.isSatisfiedBy(candidate);
    }
}
