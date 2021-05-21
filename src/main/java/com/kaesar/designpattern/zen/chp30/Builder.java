package com.kaesar.designpattern.zen.chp30;

/**
 * 抽象建造者
 *
 * @Author: chengk
 * @Date: 2021/5/20 11:59 下午
 */
public abstract class Builder {
    // 定义一个超人的应用
    protected final BuilderSuperMan superMan = new BuilderSuperMan();

    // 构建出超人的躯体
    public void setBody(String body) {
        this.superMan.setBody(body);
    }

    // 构建出超人的特殊技能
    public void setSpecialTalent(String specialTalent) {
        this.superMan.setSpecialTalent(specialTalent);
    }

    // 构建出超人的特殊标记
    public void setSpecialSymbol(String specialSymbol) {
        this.superMan.setSpecialSymbol(specialSymbol);
    }

    // 构建出一个完整的超人
    public abstract BuilderSuperMan getSuperMan();
}
