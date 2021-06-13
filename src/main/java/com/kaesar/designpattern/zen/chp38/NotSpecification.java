package com.kaesar.designpattern.zen.chp38;

/**
 * 非规格书
 *
 * @Author: chengk
 * @Date: 2021/6/13 1:45 下午
 */
public class NotSpecification extends CompositeSpecification {
    // 传递一个规格书
    private IUserSpecification2 spec;

    public NotSpecification(IUserSpecification2 spec) {
        this.spec = spec;
    }

    @Override
    public boolean isSatifiedBy(User user) {
        return !spec.isSatifiedBy(user);
    }
}
