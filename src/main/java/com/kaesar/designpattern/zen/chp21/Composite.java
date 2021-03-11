package com.kaesar.designpattern.zen.chp21;

import java.util.ArrayList;

/**
 * 树枝构件
 */
public class Composite extends Component {
    // 构件容器
    private ArrayList<Component> components = new ArrayList<>();

    // 增加一个叶子构件或树枝构件
    public void add(Component component) {
        this.components.add(component);
    }

    // 删除一个叶子构件或树枝构件
    public void remove(Component component) {
        this.components.remove(component);
    }

    // 获得分支下的所有叶子构件和树枝构件
    public ArrayList<Component> getChildren() {
        return this.components;
    }
}
