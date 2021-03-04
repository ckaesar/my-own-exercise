package com.kaesar.designpattern.zen.chp17;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdOut;

public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    // 告诉老爸学校的排名情况
    private void reportSort() {
        System.out.println("我是排名第38的...");
    }

    // 老爸看完成绩单后告诉他，加强作用
    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
