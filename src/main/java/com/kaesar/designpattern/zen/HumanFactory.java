package com.kaesar.designpattern.zen;

public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        // 定义一个声场的人种
        Human human = null;
        try {
            // 产生一个人种
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误！");
        }
        return (T) human;
    }
}
