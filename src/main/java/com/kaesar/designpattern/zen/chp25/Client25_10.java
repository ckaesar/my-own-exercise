package com.kaesar.designpattern.zen.chp25;

import java.util.ArrayList;
import java.util.List;

public class Client25_10 {
    public static void main(String[] args) {
        for (Employee2 emp : mockEmployee()) {
            emp.accept(new Visitor());
        }
    }

    // 模拟公司的人员情况，也可以通过持久层传递过来
    public static List<Employee2> mockEmployee() {
        List<Employee2> empList = new ArrayList<>();
        // 产生张三这个员工
        CommonEmployee2 zhangSan = new CommonEmployee2();
        zhangSan.setJob("编写Java程序，绝对的蓝领、苦工加搬运工");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee2.MALE);
        empList.add(zhangSan);

        // 产生李四这个员工
        CommonEmployee2 liSi = new CommonEmployee2();
        liSi.setJob("页面美工，审美素质太不流行了");
        liSi.setName("李四");
        liSi.setSalary(1900);
        liSi.setSex(Employee2.FEMALE);
        empList.add(liSi);

        // 产生一个经理
        Manager2 wangWu = new Manager2();
        wangWu.setPerformance("基本上是负值，但是我会拍马屁呀。。。");
        wangWu.setName("王五");
        wangWu.setSalary(18800);
        wangWu.setSex(Employee2.MALE);
        empList.add(wangWu);

        return empList;
    }
}
