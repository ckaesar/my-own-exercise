package com.kaesar.sword2offer;

import java.util.ArrayList;

/**
 * 标题：和为 S 的连续正数序列
 * 题目描述
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。但是他并不满足于此,他在想究竟有多少种连续的正数序列
 * 的和为100(至少包括两个数)。没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 * 返回值描述:
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 * 题目链接：
 * https://www.nowcoder.com/practice/c451a3fd84b64cb19485dad758a55ebe?tpId=13&&tqId=11194&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Jz41 {

  public ArrayList<ArrayList<Integer>> findContinuousSequence(int sum) {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    for (int i = 1; i < sum - 1; i++) {
      int cnt = i;
      for (int j = i + 1; j < sum; j++) {
        if (cnt + j < sum) {
          cnt += j;
          continue;
        } else if (cnt + j == sum) {
          ArrayList<Integer> ret = new ArrayList<>();
          for (int num = i; num <= j; num++) {
            ret.add(num);
          }
          result.add(ret);
          break;
        } else if (cnt + j > sum) {
          break;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Jz41 jz41 = new Jz41();
    ArrayList<ArrayList<Integer>> continuousSequence = jz41.findContinuousSequence(4);
    System.out.println(continuousSequence);
  }
}
