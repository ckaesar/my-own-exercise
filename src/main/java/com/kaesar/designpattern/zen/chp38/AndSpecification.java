package com.kaesar.designpattern.zen.chp38;

/**
 * 与规格书
 *
 * @Author: chengk
 * @Date: 2021/6/13 1:42 下午
 */
public class AndSpecification extends CompositeSpecification {
    // 传递两个规格书进行and操作
    private IUserSpecification2 left;
    private IUserSpecification2 right;

    public AndSpecification(IUserSpecification2 left, IUserSpecification2 right) {
        this.left = left;
        this.right = right;
    }

    // 进行and运算
    @Override
    public boolean isSatifiedBy(User user) {
        return left.isSatifiedBy(user) && right.isSatifiedBy(user);
    }
}
