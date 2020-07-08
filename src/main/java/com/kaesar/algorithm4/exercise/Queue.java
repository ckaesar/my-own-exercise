package com.kaesar.algorithm4.exercise;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdIn;
import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

/**
 * 先进先出队列
 */
public class Queue<Item> implements Iterable<Item> {

    private Node first; // 指向最早添加的结点的链接
    private Node last; // 指向最近添加的结点的链接
    private int N; // 队列中的元素数量
    private class Node {
        // 定义了结点的嵌套类
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null; // 或 N == 0
    }

    public int size() {
        return N;
    }

    public void enqueue(Item item) {
        // 向表尾添加元素
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()) {
            first = last;
        } else {
            oldlast.next = last;
        }
        N++;
    }

    public Item dequeue() {
        // 从表头删除元素
        Item item = first.item;
        first = first.next;
        if(isEmpty()) {
            last = null;
        }
        N--;
        return item;
    }

    public Iterator<Item> iterator() {
        return null;
    }

    public static void main(String[] args) {
        // 创建一个队列并操作字符串入列或出列
        Queue<String> q = new Queue<String>();

        while(!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if(!item.equals("-")) {
                q.enqueue(item);
            } else if(!q.isEmpty()) {
                StdOut.print(q.dequeue() + " ");
            }

            StdOut.println("(" + q.size() + " left on queue)");
        }
    }
}
