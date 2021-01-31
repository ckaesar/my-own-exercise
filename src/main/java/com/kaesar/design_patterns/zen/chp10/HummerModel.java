package com.kaesar.design_patterns.zen.chp10;

/**
 * 抽象悍马模型
 */
public abstract class HummerModel {
    /**
     * 首先，这个模型要能够被发动起来，别管是手摇发动，还是电力发动，反正要是能够
     * 发动起来，那这个实现要在实现类里
     */
    public abstract void start();

    // 能发动，还要能停下来，那才是真本事
    public abstract void stop();

    // 喇叭会出声音，是滴滴叫，还是哔哔叫
    public abstract void alarm();

    // 引擎会轰隆的响，不响那是假的
    public abstract void engineBoom();

    // 模型应该会跑，别管是人推的，还是电力驱动，总之是要会跑
    public void run() {
        // 先发动汽车
        this.start();
        // 引擎开始轰鸣
        this.engineBoom();
        // 然后开始跑，跑的过程中遇到一条狗，就按喇叭
        this.alarm();
        // 到达目的地就停车
        this.stop();
    }
}
