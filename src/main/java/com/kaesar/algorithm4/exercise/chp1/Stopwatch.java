package com.kaesar.algorithm4.exercise.chp1;

/**
 * 计时器
 */
public class Stopwatch {
    private final long start;

    public Stopwatch() {
        start = System.currentTimeMillis();
    }

    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }

    public static void main(String[] args) throws InterruptedException {
        Stopwatch timer = new Stopwatch();
        for(int i = 0; i < 5; i++) {
            Thread.sleep(1000);
        }
        double time = timer.elapsedTime();

        System.out.println("time: " + time + "seconds");

        for(int i = 0; i < 3; i++) {
            Thread.sleep(1000);
        }
        double time2 = timer.elapsedTime();
        System.out.println("time2: " + time2 + "seconds");
    }
}
