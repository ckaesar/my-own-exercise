/**
 * 编写一个静态方法 histogram() ，接受一个整型数组a[]和一个整数M为参数并返回一
 * * 个大小为M的数组，其中第i个元素的值为整数i在参数数组中出现的次数。如果a[]中的值均在0到M-1之
 * * 间，返回数组中所有元素之和应该和a.length相等。
 */
package com.kaesar.test;

public class HelloWorld {
  public static void main(String[] args) {
    for (int N = 0; N < 100; N++) {
      System.out.println(N + " " + F(N));
    }
  }

  public static long F(int N) {
    if (N == 0) {
      return 0;
    }
    if (N == 1) {
      return 1;
    }
    return F(N - 1) + F(N - 2);
  }
}



