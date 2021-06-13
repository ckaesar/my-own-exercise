package com.kaesar.designpattern.zen.chp38;

/**
 * 组合规格书
 *
 * @Author: chengk
 * @Date: 2021/6/13 1:58 下午
 */
public abstract class AbstractCompositeSpecification implements ISpecification {
    @Override
    public abstract boolean isSatisfiedBy(Object candidate);

    @Override
    public ISpecification and(ISpecification spec) {
        return new AndSpecification2(this, spec);
    }

    @Override
    public ISpecification or(ISpecification spec) {
        return new OrSpecification2(this, spec);
    }

    @Override
    public ISpecification not() {
        return new NotSpecification2(this);
    }
}
