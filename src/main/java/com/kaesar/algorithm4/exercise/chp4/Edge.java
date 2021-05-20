package com.kaesar.algorithm4.exercise.chp4;

/**
 * 带权重的边的数据类型
 *
 * @Author: chengk
 * @Date: 2021/5/19 11:04 下午
 */
public class Edge implements Comparable<Edge> {
    private final int v; // 顶点之一

    private final int w; // 另一个顶点

    private final double weight; // 边的权重

    /**
     * 用于初始化的构造函数
     *
     * @param v
     * @param w
     * @param weight
     */
    public Edge(int v, int w, double weight) {
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
     * 边两端的顶点之一
     *
     * @return
     */
    public int either() {
        return v;
    }

    /**
     * 另一个顶点
     *
     * @param vertex
     * @return
     */
    public int other(int vertex) {
        if (vertex == v) {
            return w;
        } else if (vertex == w) {
            return v;
        } else {
            throw new RuntimeException("Inconsistent edge");
        }
    }

    /**
     * 将这条边与that比较
     *
     * @param that
     * @return
     */
    @Override
    public int compareTo(Edge that) {
        if (this.weight() < that.weight()) {
            return -1;
        } else if (this.weight() > that.weight()) {
            return +1;
        } else {
            return 0;
        }
    }

    /**
     * 对象的字符串表示
     *
     * @return
     */
    public String toString() {
        return String.format("$d-%d %.2f", v, w, weight);
    }
}
