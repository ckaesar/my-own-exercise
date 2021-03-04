package com.kaesar.designpattern.zen.chp17;

public class Father2 {
    public static void main(String[] args) {
        // 把成绩单拿过来
        SchoolReport sr;
        // 原装的成绩单
        sr = new FouthGradeSchoolReport();
        // 加了最高分说明的成绩单
        sr = new HighScoreDecorator(sr);
        // 加了成绩排名的说明
        sr = new SortDecorator(sr);
        // 看成绩单
        sr.report();
        // 然后老爸一高兴，就签字来了。。。
        sr.sign("老三");
    }
}
