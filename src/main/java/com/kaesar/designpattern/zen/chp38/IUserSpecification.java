package com.kaesar.designpattern.zen.chp38;

/**
 * 规格书接口
 *
 * @Author: chengk
 * @Date: 2021/6/13 1:05 下午
 */
public interface IUserSpecification {
    // 候选者是否满足要求
    public boolean isSatifiedBy(User user);
}
