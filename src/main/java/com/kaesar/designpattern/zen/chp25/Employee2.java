package com.kaesar.designpattern.zen.chp25;

public abstract class Employee2 {
    public final static int MALE = 0; // 0代表男性
    public final static int FEMALE = 1; // 1代表女性

    // 姓名
    private String name;

    // 薪资
    private int salary;

    // 性别
    private int sex;

    // 我允许一个访问者访问
    public abstract void accept(IVisitor visitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
