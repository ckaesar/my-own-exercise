package com.kaesar.designpattern.zen.chp38;

/**
 * 组合规格书
 *
 * @Author: chengk
 * @Date: 2021/6/13 1:39 下午
 */
public abstract class CompositeSpecification implements IUserSpecification2 {
    // 是否满足条件由实现类实现
    @Override
    public abstract boolean isSatifiedBy(User user);

    // and 操作
    @Override
    public IUserSpecification2 and(IUserSpecification2 spec) {
        return new AndSpecification(this, spec);
    }

    // or 操作
    @Override
    public IUserSpecification2 or(IUserSpecification2 spec) {
        return new OrSpecification(this, spec);
    }

    // not 操作
    @Override
    public IUserSpecification2 not() {
        return new NotSpecification(this);
    }
}
