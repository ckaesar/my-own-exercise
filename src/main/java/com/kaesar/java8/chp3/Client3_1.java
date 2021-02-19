package com.kaesar.java8.chp3;

import java.util.ArrayList;
import java.util.List;

public class Client3_1 {
    public static void main(String[] args) {
        // (String s) -> s.length();
        // (Apple a) -> a.getWeight() > 150;
//        (int x, int y) -> {
//            System.out.println("Resullt:");
//            System.out.println(x + y);
//        };
        // () -> 42;
        // (Apple a1, Apple a2) -> a1.getWeight().comparaTo(a2.getWeight());

        // (List<String> list) -> list.isEmpty();
        // () -> new Apple();
//        (Apple a) -> {
//            System.out.println(a.getWeight());
//        };
//        (String s) -> s.length();
//        (int a, int b) -> a * b;

        Runnable r1 = () -> System.out.println("Hello world 1");
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world 2");
            }
        };
        process(r1);
        process(r2);
        process(() -> System.out.println("Hello world 3"));
    }

    public static void process(Runnable r) {
        r.run();
    }
}
