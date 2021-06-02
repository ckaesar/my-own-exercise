package com.kaesar.designpattern.zen.chp33;

/**
 * @Author: chengk
 * @Date: 2021/5/29 1:09 下午
 */
public class Client33_20 {
    public static void main(String[] args) {
        // 定义中介者
        Mediator mediator = new Mediator();
        // 定义各个同事类
        IPosition position = new Position(mediator);
        ISalary salary = new Salary(mediator);
        ITax tax = new Tax(mediator);

        // 职位提升了
        System.out.println("===职位提升===");
        position.promote();
    }
}
