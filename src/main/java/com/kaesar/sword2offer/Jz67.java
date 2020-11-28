package com.kaesar.sword2offer;

/**
 * 标题：剪绳子
 * 题目描述
 * 给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1，m<=n），每段绳子的长度记为k[1],...,k[m]。
 * 请问k[1]x...xk[m]可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * 题目链接：
 * https://www.nowcoder.com/practice/57d85990ba5b440ab888fc72b0751bf8?tpId=13&&tqId=33257&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz67 {
  /**
   * 方法一：贪心
   * 尽可能多剪长度为 3 的绳子，并且不允许有长度为 1 的绳子出现。如果出现了，就从已经切好长度为 3 的绳子中拿出一段与长度为 1 的绳子重新
   * 组合，把它们切成两段长度为 2 的绳子。
   * <p>
   * 证明：当 n >= 5 时，3(n - 3) - n = 2n - 9 > 0，且 2(n - 2) - n = n - 4 > 0。因此在 n >= 5 的情况下，将绳子
   * 剪成一段为 2 或者 3，得到的乘积会更大。又因为 3(n - 3) - 2(n - 2) = n - 5 >= 0，所以剪成一段长度为 3 比长度为 2 得到的乘积更大。
   *
   * @param target
   * @return
   */
  public int cutRope(int target) {
    if (target < 2) {
      return 0;
    }
    if (target == 2) {
      return 1;
    }
    if (target == 3) {
      return 2;
    }
    int timesOf3 = target / 3;
    if (target - timesOf3 * 3 == 1) {
      timesOf3--;
    }
    int timesOf2 = (target - timesOf3 * 3) / 2;
    return ((int) Math.pow(3, timesOf3)) * ((int) Math.pow(2, timesOf2));
  }

  /**
   * 动态规划
   *
   * @param target
   * @return
   */
  public int cutRope1(int target) {
    int[] dp = new int[target + 1];
    dp[1] = 1;
    for (int i = 2; i <= target; i++) {
      for (int j = 1; j < i; j++) {
        dp[i] = Math.max(dp[i], Math.max(j * (i - j), dp[j] * (i - j)));
      }
    }
    return dp[target];
  }

  public static void main(String[] args) {
    Jz67 jz67 = new Jz67();
    System.out.println(jz67.cutRope(2));
    System.out.println(jz67.cutRope(8));
    System.out.println("动态规划");
    System.out.println(jz67.cutRope1(2));
    System.out.println(jz67.cutRope1(8));
  }
}