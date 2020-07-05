package com.kaesar.algorithm4.exercise;

public class Ch1_1_13 {

  public static void main(String[] args) {

  }

  public int[][] reverse(int[][] mn) {
    if(mn != null && mn.length != 0) {
      int x = mn.length;
      int y = mn[0].length;
      int[][] xy = new int[y][x];
      for(int i = 0; i < x; i++) {
        for(int j = 0; j < y; j++) {
          xy[j][i] = mn[i][j];
        }
      }
      return xy;
    }
    return null;
  }
}
