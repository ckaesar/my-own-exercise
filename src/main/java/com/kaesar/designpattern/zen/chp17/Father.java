package com.kaesar.designpattern.zen.chp17;

public class Father {
    public static void main(String[] args) {
        // 把成绩单拿过来
        SchoolReport sr = new FouthGradeSchoolReport();
        // 看成绩单
        sr.report();
        // 签名？休想！

        // 把美化过的成绩单拿过来
        SchoolReport sr2 = new SugarFouthGradeSchoolReport();
        // 看成绩单
        sr.report();
        // 然后老爸一看，很开心，就签字了
        sr.sign("老三");
    }
}
