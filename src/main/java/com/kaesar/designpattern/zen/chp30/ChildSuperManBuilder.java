package com.kaesar.designpattern.zen.chp30;

/**
 * 未成年超人建造者
 *
 * @Author: chengk
 * @Date: 2021/5/21 12:05 上午
 */
public class ChildSuperManBuilder extends Builder {
    @Override
    public BuilderSuperMan getSuperMan() {
        super.setBody("强壮的躯体");
        super.setSpecialTalent("刀枪不入");
        super.setSpecialSymbol("胸前带小S标记");
        return super.superMan;
    }
}
