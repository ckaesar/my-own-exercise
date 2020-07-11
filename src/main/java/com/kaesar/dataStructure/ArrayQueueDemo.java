package com.kaesar.dataStructure;

import java.util.Scanner;

public class ArrayQueueDemo {

  public static void main(String[] args) {
    // 创建一个队列
    ArrayQueue arrayQueue = new ArrayQueue(3);
    char key = ' '; // 接受用户输入
    Scanner scanner = new Scanner(System.in);
    boolean loop = true;
    while (loop) {
      System.out.println("s(show)： 显示队列");
      System.out.println("s=e(exit)： 退出程序");
      System.out.println("a(add)： 添加数据到队列");
      System.out.println("g(get)： 从队列取出数据");
      System.out.println("h(head)： 查看队列开头的数据");
      key = scanner.next().charAt(0); // 接受一个字符
      switch (key) {
        case 's':
          arrayQueue.showQueue();
          break;
        case 'a':
          System.out.println("输入一个数");
          int value = scanner.nextInt();
          arrayQueue.addQueue(value);
          break;
        case 'g':
          try {
            int res = arrayQueue.getQueue();
            System.out.println("取出的数据是：" + res);
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
          break;
        case 'h':
          try {
            int res = arrayQueue.headQueue();
            System.out.println("队列头的数据是：" + res);
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
          break;
        case 'e':
          scanner.close();
          loop = false;
          break;
        default:
          break;
      }
    }
    System.out.println("程序退出。");
  }
}


// 使用数组模拟队列
class ArrayQueue {
  private int maxSize; // 数组的最大容量
  private int front; // 指向队列头的指针
  private int rear; // 指向队列尾的指针
  private int[] arr; // 存放数据

  // 创建队列的构造方法
  public ArrayQueue(int arrMaxSize) {
    maxSize = arrMaxSize;
    arr = new int[maxSize];
    front = -1; // 指向队列头的前一个位置
    rear = -1;
  }

  // 判断队列是否满
  public boolean isFull() {
    return rear == maxSize - 1;
  }

  // 判断队列是否为空
  public boolean isEmpty() {
    return front == rear;
  }

  // 添加数据到队列
  public void addQueue(int n) {
    // 判断队列是否满
    if (isFull()) {
      System.out.println("队列已满，不能加入数据");
      return;
    } else {
      rear++;
      arr[rear] = n;
    }
  }

  // 获取队列的数据，出队列
  public int getQueue() {
    // 判断队列是否为空
    if (isEmpty()) {
      // 通过跑出异常处理
      throw new RuntimeException("队列为空，不能取出数据");
    } else {
      front++;
      return arr[front];
    }
  }

  // 显示队列的所有数据
  public void showQueue() {
    // 遍历数据
    if (isEmpty()) {
      System.out.println("队列为空，没有数据");
    } else {
      for (int i = 0; i < arr.length; i++) {
        System.out.printf("arr[%d]=%d\n", i, arr[i]);
      }
    }
  }

  // 显示队列的头部数据，不取出
  public int headQueue() {
    if (isEmpty()) {
      throw new RuntimeException("队列为空，没有数据");
    } else {
      return arr[front + 1];
    }
  }
}