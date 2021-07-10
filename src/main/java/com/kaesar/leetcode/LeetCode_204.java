package com.kaesar.leetcode;

public class LeetCode_204 {
    /**
     * 暴力破解法：提交后超出时间限制，性能不好
     * @param n
     * @return
     */
    public static int countPrimes(int n) {
        int result = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                result++;
            }
        }
        return result;
    }

    public static boolean isPrime(int num) {
        if (num == 2 || num == 3) {
            return true;
        }
        boolean result = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(1500000));
    }
}
