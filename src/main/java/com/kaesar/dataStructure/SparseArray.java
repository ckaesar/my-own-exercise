package com.kaesar.dataStructure;

import java.io.*;

/**
 * 二维数组和稀疏数组的相互转化，并将稀疏数组保存到磁盘上 map.data ，然后重新读取
 * 稀疏数组的作用：压缩空间
 *
 */
public class SparseArray {

  public static void main(String[] args) throws IOException {
    int[][] chessArray1 = new int [11][11];
    chessArray1[1][2] = 1;
    chessArray1[2][3] = 2;

    System.out.println("原始的二维数组");
    for(int[] row: chessArray1) {
      for(int data: row) {
        System.out.printf("%d\t", data);
      }
      System.out.println();
    }

    int sum = 0;
    for(int i = 0; i < 11; i++) {
      for(int j = 0; j < 11; j++) {
        if(chessArray1[i][j] != 0) {
          sum++;
        }
      }
    }

    // 创建稀疏数组
    int sparseArr[][] = new int[sum+1][3];
    // 稀疏数组初始化
    sparseArr[0][0] = 11;
    sparseArr[0][1] = 11;
    sparseArr[0][2] = sum;

    int count = 0; // 记录是第几个非0 数据
    for(int i = 0; i < 11; i++) {
      for(int j = 0; j < 11; j++) {
        if(chessArray1[i][j] != 0) {
          count++;
          sparseArr[count][0] = i;
          sparseArr[count][1] = j;
          sparseArr[count][2] = chessArray1[i][j];
        }
      }
    }

    // 输出稀疏数组
    System.out.println("稀疏数组");
    for(int i = 0; i < sparseArr.length; i++) {
      System.out.printf("%d\t%d\t%d\t", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);
      System.out.println();
    }

    // 将稀疏数组恢复成二维数组
    int[][] chessArray2 = new int[sparseArr[0][0]][sparseArr[0][1]];
    for(int i = 1; i < sparseArr.length; i++) {
      chessArray2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
    }

    // 恢复后的二维数组
    System.out.println();
    System.out.println("恢复后的二维数组");
    for(int[] row: chessArray2) {
      for(int data: row) {
        System.out.printf("%d\t", data);
      }
      System.out.println();
    }

    // 将稀疏数组写入到文件
    File file = new File("map.data");
    FileWriter out = new FileWriter(file);
    for(int i = 0; i < sparseArr.length; i++) {
      for(int j = 0; j < sparseArr[i].length; j++) {
        out.write(sparseArr[i][j] + "\t");
      }
      out.write("\r\n");
    }
    out.close();


    // 将存入的文件写入到数组
    int[][] sparseArray2 = new int[sum+1][3];
    BufferedReader in = new BufferedReader(new FileReader(file));
    String line;
    int row = 0;
    // 逐行读取，并将每个数组放入到数组中
    while ((line = in.readLine()) != null) {
      String[] temp = line.split("\t");
      for(int j = 0; j < temp.length; j++) {
        sparseArray2[row][j] = Integer.parseInt(temp[j]);
      }
      row++;
    }
    in.close();

    // 将读取的数组打印出来
    System.out.println();
    for(int[] row1: sparseArray2) {
      for(int data: row1) {
        System.out.printf("%d\t", data);
      }
      System.out.println();
    }
  }
}
