package com.kaesar.designpattern.zen.chp33;

/**
 * 考勤情况
 *
 * @Author: chengk
 * @Date: 2021/6/6 9:15 上午
 */
public class Bonus {
    // 考勤情况
    private Attendance attendance = new Attendance();

    public int getBonus() {
        // 获得出勤情况
        int workDays = attendance.getWorkDays();
        // 奖金计算模型
        int bonus = workDays * 1800 / 30;
        return bonus;
    }
}
