package com.kaesar.designpattern.zen.chp25;

import java.util.ArrayList;
import java.util.List;

public class Client25_4 {
    public static void main(String[] args) {
        for (Employee emp : mockEmployee()) {
            emp.report();
        }
    }

    // 模拟公司的人员情况，也可以通过持久层传递过来
    public static List<Employee> mockEmployee() {
        List<Employee> empList = new ArrayList<>();
        // 产生张三这个员工
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("编写Java程序，绝对的蓝领、苦工加搬运工");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.MALE);
        empList.add(zhangSan);

        // 产生李四这个员工
        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("页面美工，审美素质太不流行了");
        liSi.setName("李四");
        liSi.setSalary(1900);
        liSi.setSex(Employee.FEMALE);
        empList.add(liSi);

        // 产生一个经理
        Manager wangWu = new Manager();
        wangWu.setPerformance("基本上是负值，但是我会拍马屁呀。。。");
        wangWu.setName("王五");
        wangWu.setSalary(18800);
        wangWu.setSex(Employee.MALE);
        empList.add(wangWu);

        return empList;
    }
}
