package com.kaesar.design_patterns.zen.chp16;

/**
 * 有处理权的人员接口
 */
public interface IHandler {
    // 一个女性（女儿、妻子或者母亲）要求逛街，你要处理这个请求
    public void handleMessage(IWomen women);
}
