package com.kaesar.algorithm4.exercise.chp5;

import com.kaesar.algorithm4.exercise.chp1.Queue;

/**
 * 基于单词查找树的符号表
 *
 * @Author: chengk
 * @Date: 2021/6/9 7:40 上午
 */
public class TrieST<Value> {
    private static int R = 256; // 基数
    private Node root; // 单词查找树的根结点

    private static class Node {
        private Object val;
        private Node[] next = new Node[R];
    }

    public Value get(String key) {
        Node x = get(root, key, 0);
        if (x == null) {
            return null;
        }
        return (Value) x.val;
    }

    public Node get(Node x, String key, int d) {
        // 返回以x作为根结点的子单词查找树中与key相关联的值
        if (x == null) {
            return null;
        }
        if (d == key.length()) {
            return x;
        }
        char c = key.charAt(d); // 找到第d个字符所对应的子单词查找树
        return get(x.next[c], key, d + 1);
    }

    public void put(String key, Value val) {
        root = put(root, key, val, 0);
    }

    private Node put(Node x, String key, Value val, int d) {
        // 如果key存在于以x为根结点的子单词查找树中则更新与它相关联的值
        if (x == null) {
            x = new Node();
        }
        if (d == key.length()) {
            x.val = val;
            return x;
        }
        char c = key.charAt(d); // 找到第d个字符所对应的子单词查找树
        x.next[c] = put(x.next[c], key, val, d + 1);
        return x;
    }

    public Iterable<String> keys() {
        return keysWithPrefix("");
    }

    public Iterable<String> keysWithPrefix(String pre) {
        Queue<String> q = new Queue<>();
        collect(get(root, pre, 0), pre, q);
        return q;
    }

    private void collect(Node x, String pre, Queue<String> q) {
        if (x == null) {
            return;
        }
        if (x.val != null) {
            q.enqueue(pre);
        }
        for (char c = 0; c < R; c++) {
            collect(x.next[c], pre + c, q);
        }
    }

    public Iterable<String> keysThatMatch(String pat) {
        Queue<String> q = new Queue<>();
        collect(root, "", pat, q);
        return q;
    }

    private void collect(Node x, String pre, String pat, Queue<String> q) {
        int d = pre.length();
        if (x == null) {
            return;
        }
        if (d == pat.length() && x.val != null) {
            q.enqueue(pre);
        }
        if (d == pat.length()) {
            return;
        }

        char next = pat.charAt(d);
        for (char c = 0; c < R; c++) {
            if (next == '.' || next == c) {
                collect(x.next[c], pre + c, pat, q);
            }
        }
    }
}
