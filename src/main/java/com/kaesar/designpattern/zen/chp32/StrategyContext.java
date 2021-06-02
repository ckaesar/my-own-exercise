package com.kaesar.designpattern.zen.chp32;

/**
 * 策略模式-环境角色
 *
 * @Author: chengk
 * @Date: 2021/5/29 11:06 上午
 */
public class StrategyContext {
    private WorkAlgorithm workMethod;

    public WorkAlgorithm getWork() {
        return workMethod;
    }

    public void setWork(WorkAlgorithm work) {
        this.workMethod = work;
    }

    // 每个算法都有必须具有的功能
    public void work() {
        workMethod.work();
    }
}
