package com.kaesar.designpattern.zen.chp32;

/**
 * 成年人状态
 *
 * @Author: chengk
 * @Date: 2021/5/29 11:17 上午
 */
public class AdultState extends HumanState {
    // 成年人的工作就是先养活自己，然后为社会做贡献
    @Override
    public void work() {
        System.out.println("// 成年人的工作就是先养活自己，然后为社会做贡献");
        super.human.setState(Human.OLD_STATE);
    }
}
