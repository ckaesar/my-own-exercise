package com.kaesar.designpattern.zen.chp30;

/**
 * 超人产品-建造者模式
 *
 * @Author: chengk
 * @Date: 2021/5/20 11:57 下午
 */
public class BuilderSuperMan {
    // 超人的躯体
    private String body;

    // 超人的特殊技能
    private String specialTalent;

    // 超人的标志
    private String specialSymbol;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSpecialTalent() {
        return specialTalent;
    }

    public void setSpecialTalent(String specialTalent) {
        this.specialTalent = specialTalent;
    }

    public String getSpecialSymbol() {
        return specialSymbol;
    }

    public void setSpecialSymbol(String specialSymbol) {
        this.specialSymbol = specialSymbol;
    }
}
