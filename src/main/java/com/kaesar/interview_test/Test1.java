package com.kaesar.interview_test;

/**
 * 哥德巴赫猜想中任意一个大于3的数都可以由多个素数组成。
 * 打印出4-100的可以由两个素数组成的数，如 4=2+2, 5=2+3, 6=3+3， 7=2+5
 */
public class Test1 {

  // 判断一个数是否是素数
  public static boolean isPrime(int n) {
    if (n == 2 || n == 3) {
      return true;
    }
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static String fun() {
    StringBuilder ret = new StringBuilder();
    for (int i = 4; i <= 100; i++) {
      for (int j = 2; j <= i / 2; j++) {
        if (isPrime(j) && isPrime(i - j)) {
          ret.append(i + "=" + j + "+" + (i - j) + ",");
          break;
        }
      }
    }
    return ret.toString();
  }

  public static void main(String[] args) {
    System.out.println(fun());

  }
}
