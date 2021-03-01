package com.kaesar.designpattern.zen.chp14;

public class Client14_11 {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        // 采购人员采购电脑
        System.out.println("-----采购人员采购电脑-----");
        Purchase1 purchase1 = new Purchase1(mediator);
        purchase1.buyIBMComputer(100);

        // 销售人员销售电脑
        System.out.println("-----销售人员销售电脑-----");
        Sale1 sale1 = new Sale1(mediator);
        sale1.sellIBMComputer(1);

        // 库存管理人员管理库存
        System.out.println("-----库存管理人员管理库存-----");
        Stock1 stock1 = new Stock1(mediator);
        stock1.clearStock();
    }
}
