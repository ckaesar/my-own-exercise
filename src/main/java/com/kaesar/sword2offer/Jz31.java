package com.kaesar.sword2offer;

/**
 * 标题：从 1 到 n 整数中 1 出现的次数
 * 题目描述
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
 * 但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 * 题目链接：
 * https://www.nowcoder.com/practice/bd7f978302044eee894445e244c7eee6?tpId=13&&tqId=11184&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz31 {

  public int numberOf1Between1AndN_Solution(int n) {
    int result = 0;
    for (int i = 1; i <= n; i++) {
      int num = i;
      while (num != 0) {
        if (num % 10 == 1) {
          result++;
        }
        num = num / 10;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Jz31 jz31 = new Jz31();
    System.out.println(jz31.numberOf1Between1AndN_Solution(10));
  }
}
