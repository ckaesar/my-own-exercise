package com.kaesar.designpattern.zen.chp38;

/**
 * 带与或非的规格书接口
 *
 * @Author: chengk
 * @Date: 2021/6/13 1:35 下午
 */
public interface IUserSpecification2 {
    // 候选者是否满足要求
    boolean isSatifiedBy(User user);

    // and 操作
    IUserSpecification2 and(IUserSpecification2 spec);

    // or 操作
    IUserSpecification2 or(IUserSpecification2 spec);

    // not 操作
    IUserSpecification2 not();
}
