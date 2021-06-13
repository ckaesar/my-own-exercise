package com.kaesar.designpattern.zen.chp38;

/**
 * 或规格书
 *
 * @Author: chengk
 * @Date: 2021/6/13 1:43 下午
 */
public class OrSpecification extends CompositeSpecification {
    // 传递两个规格书进行and操作
    private IUserSpecification2 left;
    private IUserSpecification2 right;

    public OrSpecification(IUserSpecification2 left, IUserSpecification2 right) {
        this.left = left;
        this.right = right;
    }

    // 进行and运算
    @Override
    public boolean isSatifiedBy(User user) {
        return left.isSatifiedBy(user) || right.isSatifiedBy(user);
    }
}
