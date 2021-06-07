package com.kaesar.designpattern.zen.chp33;

import java.util.Random;

/**
 * 绩效
 *
 * @Author: chengk
 * @Date: 2021/6/6 9:17 上午
 */
public class Performance {
    // 基本工资
    private BasicSalary salary = new BasicSalary();

    public int getPerformanceValue() {
        // 随机绩效
        int perf = (new Random()).nextInt(100);
        return salary.getBasicSalary() * perf / 100;
    }
}
