package com.kaesar.designpattern.zen.chp22;

public class HanFeiZi implements IHanFeiZi {
    // 韩非子是否在吃饭，作为监控的判断标准
    private boolean isHavingBreakfast = false;

    // 韩非子是否在娱乐
    private boolean isHavingFun = false;

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子在吃饭...");
        this.isHavingBreakfast = true;
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子在娱乐...");
        isHavingFun = true;
    }

    public boolean isHavingBreakfast() {
        return isHavingBreakfast;
    }

    public void setHavingBreakfast(boolean havingBreakfast) {
        isHavingBreakfast = havingBreakfast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingFun(boolean havingFun) {
        isHavingFun = havingFun;
    }
}
