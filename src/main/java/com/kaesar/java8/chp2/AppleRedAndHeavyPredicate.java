package com.kaesar.java8.chp2;

public class AppleRedAndHeavyPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
