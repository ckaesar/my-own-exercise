package com.kaesar.jvm_zzm.chp6;

public class TestClass {
    private int m;

    public int inc() {
        return m + 1;
    }

    public int inc(int x) {
        int a;
        try {
            a = 1;
            return a;
        } catch (Exception e) {
            a = 2;
            return a;
        } finally {
            a = 3;
        }
    }
}
