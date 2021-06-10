//package com.kaesar.leetcode;
//
//public class Solution {
//    public static String intToRoman(int num) {
//        int countThousand = num / 1000;
//        num = num % 1000;
//        int countFiveHundred = num / 500;
//        num = num  % 500;
//        int countHundred = num / 100;
//        num = num % 100;
//        int countFiFty = num / 50;
//        num = num % 50;
//        int countTen = num / 10;
//        num = num % 10;
//        int countFive = num / 5;
//        num = num % 5;
//
//        StringBuilder sb = new StringBuilder();
//        if(countThousand > 0) {
//            for(int i = 0; i < countThousand) {
//                sb.append("M");
//            }
//        }
//        if(countFiveHundred > 0) {
//
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(intToRoman(3));
//        System.out.println(intToRoman(4));
//        System.out.println(intToRoman(9));
//        System.out.println(intToRoman(58));
//        System.out.println(intToRoman(1994));
//    }
//}
//
//
//
//
//
//
//
//
//
