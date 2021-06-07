package com.kaesar.designpattern.zen.chp33;

/**
 * 总工资计算
 *
 * @Author: chengk
 * @Date: 2021/6/6 9:20 上午
 */
public class SalaryProvider {
    // 基本工资
    private BasicSalary basicSalary = new BasicSalary();
    // 奖金
    private Bonus bonus = new Bonus();
    // 绩效
    private Performance performance = new Performance();
    // 税收
    private Taxs taxs = new Taxs();

    // 获得用户的总收入
    public int totalSalary() {
        return basicSalary.getBasicSalary() + bonus.getBonus()
                + performance.getPerformanceValue()
                - taxs.getTaxs();
    }
}
