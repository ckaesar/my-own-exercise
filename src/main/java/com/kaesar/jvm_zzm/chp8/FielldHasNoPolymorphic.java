package com.kaesar.jvm_zzm.chp8;

/**
 * 字段没有多态性
 */
public class FielldHasNoPolymorphic {
    static class Father {
        public int money = 1;

        public Father() {
            money = 2;
            showMeTheMoney();
        }

        public void showMeTheMoney() {
            System.out.println("I am Father, i hava " + money + "￥");
        }
    }

    static class Son extends Father {
        public int money = 3;

        public Son() {
            money = 4;
            showMeTheMoney();
        }

        @Override
        public void showMeTheMoney() {
            System.out.println("I am Son, i have " + money + "￥");
        }
    }

    public static void main(String[] args) {
        Father guy = new Son();
        System.out.println("this guy has " + guy.money + "￥");
    }
}
