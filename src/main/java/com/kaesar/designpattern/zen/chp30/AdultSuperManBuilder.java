package com.kaesar.designpattern.zen.chp30;

/**
 * 成年超人构建者
 *
 * @Author: chengk
 * @Date: 2021/5/21 12:03 上午
 */
public class AdultSuperManBuilder extends Builder {

    @Override
    public BuilderSuperMan getSuperMan() {
        super.setBody("强壮的躯体");
        super.setSpecialTalent("会飞行");
        super.setSpecialSymbol("胸前带S标记");
        return super.superMan;
    }
}
