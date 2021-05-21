package com.kaesar.designpattern.zen.chp29;

/**
 * @Author: chengk
 * @Date: 2021/5/20 11:24 下午
 */
public class Client29_15 {
    public static void main(String[] args) {
        House house = new House();
        System.out.println("-----房地产公司是这样运行的-----");
        // 先找到房地产公司
        House2Corp house2Corp = new House2Corp(house);
        // 看我怎么赚钱
        house2Corp.makeMoney();
        System.out.println("\n");
        // 山寨公司生产的产品很多，不过我只要指定产品就成了
        System.out.println("-----山寨公司是这样运行的-----");
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new Clothes());
        shanZhaiCorp.makeMoney();
    }
}
