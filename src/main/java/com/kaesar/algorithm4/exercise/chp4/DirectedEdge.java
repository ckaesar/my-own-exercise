package com.kaesar.algorithm4.exercise.chp4;

/**
 * 加权有向边的数据类型
 *
 * @Author: chengk
 * @Date: 2021/5/23 10:03 上午
 */
public class DirectedEdge {
    private final int v; // 边的起点
    private final int w; // 边的终点
    private final double weight; // 边的权重

    public DirectedEdge(int v, int w, double weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    /**
     * 边的权重
     *
     * @return
     */
    public double weight() {
        return weight;
    }

    /**
     * 指出这条边的顶点
     *
     * @return
     */
    public int from() {
        return v;
    }

    /**
     * 这条边指向的顶点
     *
     * @return
     */
    public int to() {
        return w;
    }

    /**
     * 对象的字符串表示
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format("%d->%d %.2f", v, w, weight);
    }
}
