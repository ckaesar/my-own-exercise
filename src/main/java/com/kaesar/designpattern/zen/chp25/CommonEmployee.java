package com.kaesar.designpattern.zen.chp25;

public class CommonEmployee extends Employee {
    // 工作内容
    private String job;

    @Override
    protected String getOtherInfo() {
        return "工作：" + job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
