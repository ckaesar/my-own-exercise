package com.kaesar.interview_zuo.t006;

import java.util.Stack;

/**
 * 用栈来求解汉诺塔问题
 * 非递归
 */
public class HanoiProblem2 {

  public enum Action {
    No, LToM, MToL, MToR, RToM;
  }

  public int hanoiProblem2(int num, String left, String mid, String right) {
    Stack<Integer> lS = new Stack<Integer>();
    Stack<Integer> mS = new Stack<Integer>();
    Stack<Integer> rS = new Stack<Integer>();
    lS.push(Integer.MAX_VALUE);
    mS.push(Integer.MAX_VALUE);
    rS.push(Integer.MAX_VALUE);
    for (int i = num; i > 0; i--) {
      lS.push(i);
    }

    Action[] record = {Action.No};
    int step = 0;
    while (rS.size() != num + 1) {
      step += fStackToStack(record, Action.MToL, Action.LToM, lS, mS, left, mid);
      step += fStackToStack(record, Action.LToM, Action.MToL, mS, lS, mid, left);
      step += fStackToStack(record, Action.RToM, Action.MToR, mS, rS, mid, right);
      step += fStackToStack(record, Action.MToR, Action.RToM, rS, mS, right, mid);
    }
    return step;
  }

  public static int fStackToStack(Action[] record,
                                  Action preNoAct,
                                  Action nowAct,
                                  Stack<Integer> fStack,
                                  Stack<Integer> tStack,
                                  String from,
                                  String to) {
    if (record[0] != preNoAct && fStack.peek() < tStack.peek()) {
      tStack.push(fStack.pop());
      System.out.println("Move " + tStack.peek() + " from " + from + " to " + to);
      record[0] = nowAct;
      return 1;
    }
    return 0;
  }
}


