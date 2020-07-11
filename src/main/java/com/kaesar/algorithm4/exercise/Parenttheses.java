package com.kaesar.algorithm4.exercise;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.Stack;

/**
 * 习题 1.3.4
 * 编写一个Stack的用例，从标准输入中读取一个文本流并使用栈判定其中的括号是否配对完整。例如，对于 [()]{}{[()()]()}
 * 程序应该打印true，对于 [(]) 则打印false
 */
public class Parenttheses {

  public static boolean check(String ops) {
    Stack<Character> leftCharacters = new Stack<Character>();
    boolean flag = true;
    for (Character op : ops.toCharArray()) {
      if (op == '[' || op == '(' || op == '{') {
        leftCharacters.push(op);
      } else if (op == ']') {
        char current = leftCharacters.pop();
        if (current != '[') {
          flag = false;
          break;
        }
      } else if (op == '}') {
        char current = leftCharacters.pop();
        if (current != '{') {
          flag = false;
          break;
        }
      } else if (op == ')') {
        char current = leftCharacters.pop();
        if (current != '(') {
          flag = false;
          break;
        }
      }
    }
    if (!leftCharacters.isEmpty()) {
      flag = false;
    }

    return flag;
  }

  public static void main(String[] args) {
    String ops1 = "[()]{}{[()()]()}";
    String ops2 = "[(])";
    System.out.println(check(ops1));
    System.out.println(check(ops2));

  }
}
