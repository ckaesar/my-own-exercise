package com.kaesar.algorithm4.exercise.chp3;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.ST;
import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.StdOut;

/**
 * 符号表的行为测试用例
 */
public class BehavioralTestingForST {
    public static void main(String[] args) {
        ST<String, Integer> st;
        st = new ST<>();
        String testStr = "searchexample";
        for (int i = 0; i < testStr.length(); i++) {
            String key = String.valueOf(testStr.charAt(i));
            st.put(key, i);
        }

        for (String key : st.keys()) {
            StdOut.println(key + " " + st.get(key));
        }
    }
}
