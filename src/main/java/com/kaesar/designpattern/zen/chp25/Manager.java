package com.kaesar.designpattern.zen.chp25;

public class Manager extends Employee {
    // 这类人物的职责非常明确：业绩
    private String performance;

    @Override
    protected String getOtherInfo() {
        return "业绩：" + this.performance + "\t";
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }
}
