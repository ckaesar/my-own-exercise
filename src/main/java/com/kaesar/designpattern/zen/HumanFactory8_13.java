package com.kaesar.designpattern.zen;

/**
 * 简单工厂模式中的工厂类
 */
public class HumanFactory8_13 {
    public static <T extends Human> T createHuman(Class<T> c) {
        // 定义一个生产出的人种
        Human human = null;
        try {
            // 产生一个人种
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误！");
        }
        return (T) human;
    }
}
