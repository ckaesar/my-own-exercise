package com.kaesar.algorithm4.exercise.chp3;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.ST;
import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdIn;
import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdOut;

/**
 * 符号表的性能测试用例
 */
public class FrequencyCounter {
    public static void main(String[] args) {
        int minlen = Integer.parseInt(args[0]); // 最小键长
        ST<String, Integer> st = new ST<>();
        while (!StdIn.isEmpty()) {
            // 构造符号表并统计频率
            String word = StdIn.readString();
            if (word.length() < minlen) continue; // 忽略较短的单词
            if (!st.contains(word)) {
                st.put(word, 1);
            } else {
                st.put(word, st.get(word) + 1);
            }
        }

        // 找出出现频率最高的单词
        String max = " ";
        st.put(max, 0);
        for (String word : st.keys()) {
            if (st.get(word) > st.get(max)) {
                max = word;
            }
        }
        StdOut.println(max + " " + st.get(max));
    }
}
