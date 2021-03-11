package com.kaesar.designpattern.zen.chp21;

import java.util.ArrayList;

public interface IBranch2 extends ICorp {
    // 能够增加树叶节点或者树枝节点
    public void addSuboardinate(ICorp corp);

    // 我还要能够获得下属的信息
    public ArrayList<ICorp> getSuboardinate();
}
