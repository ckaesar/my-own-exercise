package com.kaesar.designpattern.zen.chp38;

import java.util.ArrayList;

/**
 * @Author: chengk
 * @Date: 2021/6/13 2:10 下午
 */
public class Client38_28 {
    public static void main(String[] args) {
        // 待分析的对象
        ArrayList<Object> list = new ArrayList<>();
        // 定义两个业务规格书
        ISpecification spec1 = new BizSpecification(new Object());
        ISpecification spec2 = new BizSpecification(new Object());
        // 规则的调用
        for (Object o : list) {
            if (spec1.and(spec2).isSatisfiedBy(o)) {
                System.out.println(o);
            }
        }
    }
}
