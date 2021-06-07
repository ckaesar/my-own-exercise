package com.kaesar.designpattern.zen.chp33;

import java.util.Random;

/**
 * 考勤情况
 *
 * @Author: chengk
 * @Date: 2021/6/6 9:14 上午
 */
public class Attendance {
    // 得到出勤天数
    public int getWorkDays() {
        return (new Random()).nextInt(30);
    }
}
