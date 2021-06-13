package com.kaesar.designpattern.zen.chp38;

/**
 * 业务规格书
 *
 * @Author: chengk
 * @Date: 2021/6/13 2:09 下午
 */
public class BizSpecification extends AbstractCompositeSpecification {
    // 基准对象
    private Object obj;

    public BizSpecification(Object obj) {
        this.obj = obj;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        // 根据基准对象和候选对象，进行业务判断，返回boolean
        return false;
    }
}
