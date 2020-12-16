package com.kaesar.sword2offer;

/**
 * 标题：构建乘积数组
 * 题目描述
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 * （注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
 * 对于A长度为1的情况，B无意义，故而无法构建，因此该情况不会存在。
 * 题目链接：
 * https://www.nowcoder.com/practice/94a4d381a68b47b7a8bed86f2975db46?tpId=13&&tqId=11204&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz51 {

  public int[] multiply11(int[] A) {
    int n = A.length;
    int[] B = new int[n];
    for (int i = 0; i < n; i++) {
      B[i] = 1;
      for (int j = 0; j < n; j++) {
        if (i != j) {
          B[i] *= A[j];
        }
      }
    }
    return B;
  }

  public int[] multiply(int[] A) {
    int n = A.length;
    int[] B = new int[n];
    for (int i = 0, product = 1; i < n; product *= A[i], i++)       /* 从左往右累乘 */
      B[i] = product;
    for (int i = n - 1, product = 1; i >= 0; product *= A[i], i--)  /* 从右往左累乘 */
      B[i] *= product;
    return B;
  }

  public static void main(String[] args) {
    Jz51 jz51 = new Jz51();
    int[] A = new int[] {1, 2, 3, 4, 5, 6};
    int[] result = jz51.multiply(A);
    for (int num : result) {
      System.out.print(num + " ");
    }

    System.out.println();
    System.out.println("---------");
    int[] result2 = jz51.multiply11(A);
    for (int num : result2) {
      System.out.print(num + " ");
    }
  }
}
