package com.kaesar.designpattern.zen.chp31;

/**
 * @Author: chengk
 * @Date: 2021/5/23 2:19 下午
 */
public class Client31_12 {
    public static void main(String[] args) {
        // 很久很久以前，这里有一只丑陋的小鸭子
        System.out.println("===很久很久以前，这里有一只丑陋的小鸭子===");
        Swan duckling = new UglyDuckling();
        // 展示一下小鸭子
        duckling.desApperance(); // 小鸭子的外形
        duckling.cry(); // 小鸭子的叫声
        duckling.fly(); // 小鸭子的行为

        System.out.println("\n===小鸭子终于发现自己是一只天鹅===");
        // 首先外形变化了
        duckling = new BeautifyAppearance(duckling);
        // 其次行为也发生了变化
        duckling = new StrongBehavior(duckling);
        // 虽然还是叫丑小鸭，但是已经发生了很大的变化
        duckling.desApperance(); // 小鸭子的新外形
        duckling.cry(); // 小鸭子的新叫声
        duckling.fly(); // 小鸭子的新行为
    }
}
