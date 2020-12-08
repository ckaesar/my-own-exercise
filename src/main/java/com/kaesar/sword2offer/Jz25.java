package com.kaesar.sword2offer;

/**
 * 标题：复杂链表的复制
 * 题目描述
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针random指向一个随机节点），请对此链表进行深拷贝，
 * 并返回拷贝后的头结点。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 * 题目链接：
 * https://www.nowcoder.com/practice/f836b2c43afc4b35ad6adc41ec941dba?tpId=13&&tqId=11178&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz25 {

  public RandomListNode clone11(RandomListNode pHead) {
    if (pHead == null || pHead.next == null) {
      RandomListNode result = pHead;
      return result;
    }
    RandomListNode cur = pHead;
    while (cur != null) {
      RandomListNode node = new RandomListNode(cur.label);
      node.next = cur.next;
      cur.next = node;
      cur = node.next;
    }
    RandomListNode randomCur = pHead;
    while (randomCur.random != null) {
      randomCur.next.random = randomCur.random.next;
      randomCur = randomCur.next;
    }
    RandomListNode newHead = pHead.next;
    RandomListNode newCur = newHead;
    RandomListNode oldCur = pHead;
    while (oldCur != null) {
      oldCur.next = newCur.next;
      newCur.next = newCur.next.next;
      oldCur = oldCur.next;
      newCur = newCur.next;
    }
    return newHead;
  }


  /**
   * 方法：
   * 第一步，在每个节点的后面插入复制的节点。
   * 第二步，对复制节点的 random 链接进行赋值。
   * 第三步，拆分。
   *
   * @param pHead
   * @return
   */
  public RandomListNode clone(RandomListNode pHead) {
    if (pHead == null) {
      return null;
    }
    // 插入新节点
    RandomListNode cur = pHead;
    while (cur != null) {
      RandomListNode clone = new RandomListNode(cur.label);
      clone.next = cur.next;
      cur.next = clone;
      cur = clone.next;
    }
    // 建立 random 链接
    cur = pHead;
    while (cur != null) {
      RandomListNode clone = cur.next;
      if (cur.random != null) {
        clone.random = cur.random.next;
      }
      cur = clone.next;
    }
    // 拆分
    cur = pHead;
    RandomListNode pCloneHead = pHead.next;
    while (cur.next != null) {
      RandomListNode next = cur.next;
      cur.next = next.next;
      cur = next;
    }
    return pCloneHead;
  }
}


class RandomListNode {
  int label;
  RandomListNode next = null;
  RandomListNode random = null;

  RandomListNode(int label) {
    this.label = label;
  }
}