package com.kaesar.dataStructure.nowcoder_classic_code;

import java.util.Stack;

/**
 * 标题：后缀表达式求值
 * 题目描述
 * 计算逆波兰式（后缀表达式）的值
 * 运算符仅包含"+","-","*"和"/"，被操作数可能是整数或其他表达式
 * 例如：
 * ["20", "10", "+", "30", "*"] -> ((20 + 10) * 30) -> 900
 * ["40", "130", "50", "/", "+"] -> (40 + (130 / 50)) -> 42
 * 题目链接
 * https://www.nowcoder.com/practice/22f9d7dd89374b6c8289e44237c70447?tpId=46&&tqId=29031&rp=1&ru=/ta/classic-code&qru=/ta/classic-code/question-ranking
 */
public class Lc002 {

  /**
   * @param tokens string字符串一维数组
   * @return int整型
   */
  public static int evalRPN(String[] tokens) {
    Stack<String> numsStr = new Stack<>();
    for (String numStr : tokens) {
      if ("+".equals(numStr) || "-".equals(numStr) || "*".equals(numStr) || "/".equals(numStr)) {
        int a = Integer.valueOf(numsStr.pop());
        int b = Integer.valueOf(numsStr.pop());
        if ("+".equals(numStr)) {
          numsStr.push(String.valueOf(a + b));
        } else if ("-".equals(numStr)) {
          numsStr.push(String.valueOf(b - a));
        } else if ("*".equals(numStr)) {
          numsStr.push(String.valueOf(b * a));
        } else if ("/".equals(numStr)) {
          numsStr.push(String.valueOf(b / a));
        }
      } else {
        numsStr.push(numStr);
      }
    }
    return Integer.valueOf(numsStr.peek());
  }

  public static void main(String[] args) {
    String[] tokens = new String[] {"20", "10", "+", "30", "*"};
    System.out.println(evalRPN(tokens));

    String[] tokens2 = new String[] {"40", "130", "50", "/", "+"};
    System.out.println(evalRPN(tokens2));
  }
}
