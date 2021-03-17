package com.kaesar.designpattern.zen.chp25;

public class CommonEmployee2 extends Employee2 {
    // 工作内容
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
