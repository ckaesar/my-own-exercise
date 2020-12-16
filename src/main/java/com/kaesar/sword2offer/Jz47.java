package com.kaesar.sword2offer;

/**
 * 标题：求 1+2+3+...+n
 * 题目描述
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * 题目链接：
 * https://www.nowcoder.com/practice/7a0da8fc483247ff8800059e12d7caf1?tpId=13&&tqId=11200&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz47 {

  /**
   * 使用递归解法最重要的是指定返回条件，但是本题无法直接使用 if 语句来指定返回条件。
   * 条件与 && 具有短路原则，即在第一个条件语句为 false 的情况下不会去执行第二个条件语句。利用这一特性，将递归的返回条件取非然后作为 && 的第一个条件语句，
   * 递归的主体转换为第二个条件语句，那么当递归的返回条件为 true 的情况下就不会执行递归的主体部分，递归返回。
   * 本题的递归返回条件为 n <= 0，取非后就是 n > 0；递归的主体部分为 sum += Sum_Solution(n - 1)，转换为条件语句后就是 (sum += Sum_Solution(n - 1)) > 0。
   *
   * @param n
   * @return
   */
  public int sum_Solution(int n) {
    int sum = n;
    boolean b = (n > 0) && ((sum += sum_Solution(n - 1)) > 0);
    return sum;
  }

  public static void main(String[] args) {
    Jz47 jz47 = new Jz47();
    System.out.println(jz47.sum_Solution(5));
    System.out.println(jz47.sum_Solution(6));
    System.out.println(jz47.sum_Solution(7));
    System.out.println(jz47.sum_Solution(8));
  }
}
