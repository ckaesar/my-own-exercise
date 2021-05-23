package com.kaesar.designpattern.zen.chp31;

import java.util.Random;

/**
 * 代理人
 *
 * @Author: chengk
 * @Date: 2021/5/23 12:31 下午
 */
public class RunnerAgent implements IRunner {
    private IRunner runner;

    public RunnerAgent(IRunner _runner) {
        this.runner = _runner;
    }

    // 代理人是不会跑步的
    @Override
    public void run() {
        Random rand = new Random();
        if (rand.nextBoolean()) {
            System.out.println("代理人同意安排运动员跑步");
            runner.run();
        } else {
            System.out.println("代理人心情不好，不安排运动员跑步");
        }
    }
}
