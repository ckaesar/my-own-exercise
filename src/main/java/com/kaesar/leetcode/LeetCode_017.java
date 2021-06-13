package com.kaesar.leetcode;

import java.util.*;

public class LeetCode_017 {

    private static Map<Integer, List<Character>> mappings = new HashMap<>();

    static {
        mappings.put(2, new ArrayList<>(Arrays.asList('a', 'b', 'c')));
        mappings.put(3, new ArrayList<>(Arrays.asList('d', 'e', 'f')));
        mappings.put(4, new ArrayList<>(Arrays.asList('g', 'h', 'i')));
        mappings.put(5, new ArrayList<>(Arrays.asList('j', 'k', 'l')));
        mappings.put(6, new ArrayList<>(Arrays.asList('m', 'n', 'o')));
        mappings.put(7, new ArrayList<>(Arrays.asList('p', 'q', 'r', 's')));
        mappings.put(8, new ArrayList<>(Arrays.asList('t', 'u', 'v')));
        mappings.put(9, new ArrayList<>(Arrays.asList('w', 'x', 'y', 'z')));
    }

    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }
        Set<String> result = new HashSet<>();
        for (Character temp : mappings.get(Integer.valueOf(String.valueOf(digits.charAt(0))))) {
            result.add(temp.toString());
        }
        for (int i = 1; i < digits.length(); i++) {
            Set<String> tempResult = result;
            result = new HashSet<>();
            for (String s : tempResult) {
                for (Character character : mappings.get(Integer.valueOf(String.valueOf(digits.charAt(i))))) {
                    if (!result.contains(s + character)) {
                        result.add(s + character);
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        List<String> strings = letterCombinations("2");
        for (String string : strings) {
            System.out.print(string + "--");
        }
    }
}