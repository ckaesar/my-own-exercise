package com.kaesar.leetcode;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode_036 {
    public static List<Pair<Integer, Integer>> all = new ArrayList<>();

    static {
        all.add(new Pair<>(0, 0));
        all.add(new Pair<>(0, 3));
        all.add(new Pair<>(0, 6));
        all.add(new Pair<>(3, 0));
        all.add(new Pair<>(3, 3));
        all.add(new Pair<>(3, 6));
        all.add(new Pair<>(6, 0));
        all.add(new Pair<>(6, 3));
        all.add(new Pair<>(6, 6));
    }

    public static boolean isValidSudoku(char[][] board) {
        // 行判断
        for (int i = 0; i < board.length; i++) {
            Set<Character> nums = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.' && !nums.add(board[i][j])) {
                    return false;
                }
            }
        }
        // 列判断
        for (int i = 0; i < board.length; i++) {
            Set<Character> nums = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] != '.' && !nums.add(board[j][i])) {
                    return false;
                }
            }
        }
        // 宫内判断
        for (Pair<Integer, Integer> integerIntegerPair : all) {
            Set<Character> nums = new HashSet<>();
            for (int x = integerIntegerPair.getKey(); x < integerIntegerPair.getKey() + 3; x++) {
                for (int y = integerIntegerPair.getValue(); y < integerIntegerPair.getValue() + 3; y++) {
                    if (board[x][y] != '.' && !nums.add(board[x][y])) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println(isValidSudoku(board));
    }
}
