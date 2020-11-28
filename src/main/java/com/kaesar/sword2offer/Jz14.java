package com.kaesar.sword2offer;

/**
 * 标题：链表中倒数第 K 个结点
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 * 题目链接：https://www.nowcoder.com/practice/529d3ae5a407492994ad2a246518148a?tpId=13&&tqId=11167&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz14 {


  public ListNode FindKthToTail(ListNode head, int k) {
    if (head == null || k < 1) {
      return null;
    }
    int cnt = 1;
    ListNode node = head;
    while (node.next != null) {
      node = node.next;
      cnt++;
    }
    if (k > cnt) {
      return null;
    }
    ListNode result = head;
    for (int i = 0; i < cnt - k; i++) {
      result = result.next;
    }
    return result;
  }

  /**
   * 方法二：双指针移动
   * 作者：CyC2018
   * 链接：https://www.nowcoder.com/discuss/198840?type=1
   * 来源：牛客网
   * <p>
   * 设链表的长度为 N。设置两个指针 P1 和 P2，先让 P1 移动 K 个节点，则还有 N - K 个节点可以移动。此时让 P1 和 P2 同时移动，
   * 可以知道当 P1 移动到链表结尾时，P2 移动到第 N - K 个节点处，该位置就是倒数第 K 个节点。
   *
   * @param head
   * @param k
   * @return
   */
  public ListNode FindKthToTail2(ListNode head, int k) {
    if (head == null) {
      return null;
    }
    ListNode p1 = head;
    while (p1 != null && k-- > 0) {
      p1 = p1.next;
    }
    if (k > 0) {
      return null;
    }
    ListNode p2 = head;
    while (p1 != null) {
      p1 = p1.next;
      p2 = p2.next;
    }
    return p2;
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    Jz14 jz14 = new Jz14();
    System.out.println(jz14.FindKthToTail(head, 1).val);
    System.out.println(jz14.FindKthToTail2(head, 1).val);
  }
}
