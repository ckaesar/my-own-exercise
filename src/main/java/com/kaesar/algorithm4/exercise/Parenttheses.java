package com.kaesar.algorithm4.exercise;

import com.kaesar.algorithm4.base.edu.princeton.cs.algs4.Stack;

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
