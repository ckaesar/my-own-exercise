package com.kaesar.designpattern.zen.chp25;

public interface IVisitor {
    // 首先，定义我可以访问普通员工
    public void visit(CommonEmployee2 commonEmployee);

    // 其次，定义我可以访问部门经理
    public void visit(Manager2 manager);
}
