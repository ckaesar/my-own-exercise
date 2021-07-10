package com.kaesar.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_205 {
    public static boolean isIsomorphic(String s, String t) {
        if (s == null && t == null) {
            return true;
        }
        if ((s == null && t != null) || (s != null && t == null)) {
            return false;
        }
        Map<Character, Character> mappings = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (mappings.keySet().contains(s.charAt(i))) {
                if (!(mappings.get(s.charAt(i)) == t.charAt(i))) {
                    return false;
                }
            } else {
                if (mappings.values().contains(t.charAt(i))) {
                    return false;
                } else {
                    mappings.put(s.charAt(i), t.charAt(i));
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("paper", "title"));
    }
}
