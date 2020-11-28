package com.kaesar.sword2offer;

/**
 * 标题：二进制中 1 的个数
 * 题目描述
 * 输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
 * 题目链接：
 * https://www.nowcoder.com/practice/8ee967e43c2c4ec193b040ea7fbb10b8?tpId=13&&tqId=11164&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz11 {

  public static void main(String[] args) {
    Jz11 jz11 = new Jz11();
    System.out.println(jz11.numberOf1(10));
    System.out.println(jz11.numberOf1_2(10));
  }

  /**
   * n&(n-1)
   * 该位运算去除 n 的位级表示中最低的那一位。
   * n       : 10110100
   * n-1     : 10110011
   * n&(n-1) : 10110000
   *
   * @param n
   * @return
   */
  public int numberOf1(int n) {
    int cnt = 0;
    while (n != 0) {
      cnt++;
      n &= n - 1;
    }
    return cnt;
  }

  /**
   * 库方法
   * @param n
   * @return
   */
  public int numberOf1_2(int n) {
    return Integer.bitCount(n);
  }
}