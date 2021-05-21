package com.kaesar.designpattern.zen.chp29;

/**
 * 房地产公司
 *
 * @Author: chengk
 * @Date: 2021/5/20 11:21 下午
 */
public class House2Corp extends AbstractCorp {
    // 定义传递一个House产品进来
    public House2Corp(House house) {
        super(house);
    }

    // 房地产公司很High了，赚钱，计算利润
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了...");
    }
}
