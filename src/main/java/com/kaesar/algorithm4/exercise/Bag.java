package com.kaesar.algorithm4.exercise;

import java.util.Iterator;

/**
 * 背包：背包是一种不支持从中删除元素的集合数据类型-它的目的就是帮助用例收集元素并迭代遍历所有收集到的元素
 * @param <Item>
 */
public class Bag<Item> implements Iterable<Item> {

    private Node first; // 链表得首结点
    private int size; // 背包的节点个数

    private class Node {
        Item item;
        Node next;
    }

    public void add(Item item) {
        // 和Stack的push()方法完全相同
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        size++;
    }

    public int size() {
        return size;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext() {
            return current != null;
        }

        public void remove() {

        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
