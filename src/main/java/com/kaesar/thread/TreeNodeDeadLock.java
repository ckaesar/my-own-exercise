package com.kaesar.thread;

import java.util.ArrayList;
import java.util.List;

public class TreeNodeDeadLock {
  TreeNodeDeadLock parent = null;
  List children = new ArrayList<TreeNodeDeadLock>();

  public synchronized void addChild(TreeNodeDeadLock child) {
    if (!this.children.contains(child)) {
      this.children.add(child);
      child.setParentOnly(this);
    }
  }

  public synchronized void addChildOnly(TreeNodeDeadLock child) {
    if (!this.children.contains(child)) {
      this.children.add(child);
    }
  }

  public synchronized void setParent(TreeNodeDeadLock parent) {
    this.parent = parent;
    parent.addChildOnly(this);
  }

  public synchronized void setParentOnly(TreeNodeDeadLock parent) {
    this.parent = parent;
  }

  public static void main(String[] args) {
    TreeNodeDeadLock parent = new TreeNodeDeadLock();
    TreeNodeDeadLock child = new TreeNodeDeadLock();
    new Thread() {
      @Override
      public void run() {
        System.out.println("thread1: before add child");
        parent.addChild(child);
        System.out.println("thread1: after add child");
      }
    }.start();

    new Thread() {
      @Override
      public void run() {
        System.out.println("thread1: before set parent");
        child.setParent(parent);
        System.out.println("thread1: after set parent");
      }
    }.start();
  }
}
