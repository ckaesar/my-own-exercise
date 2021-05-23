package com.kaesar.designpattern.zen.chp31;

/**
 * 装饰类
 *
 * @Author: chengk
 * @Date: 2021/5/23 12:36 下午
 */
public class RunnerWithJet implements IRunner {
    private IRunner runner;

    public RunnerWithJet(IRunner _runner) {
        this.runner = _runner;
    }

    @Override
    public void run() {
        System.out.println("加快运动员的速度：为运动员增加喷气装置");
        runner.run();
    }
}
