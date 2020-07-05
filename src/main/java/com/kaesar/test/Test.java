package com.kaesar.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {

  public LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
  public ArrayList<Integer> temp= new ArrayList<Integer>();
  public int []nums;
  public boolean []flag;
  public List<List<Integer>> permuteUnique(int[] nums) {
    if(nums == null || nums.length == 0)
      return res;
    this.nums=nums;
    flag=new boolean[nums.length];
    Arrays.sort(nums);
    helper();
    return res;
  }
  public void helper() {
    int last=nums[0]-1;
    if(temp.size()==nums.length)
      res.add((ArrayList<Integer>)temp.clone());//浅拷贝
    else{
      for(int i=0;i<nums.length;i++)
        //这里要保证的是每一轮对每个位置选出的数不重复。
        if(flag[i]==false&&nums[i]!=last){
          flag[i]=true;
          temp.add(nums[i]);
          last=nums[i];
          int tail=temp.size();
          helper();
          //恢复现场
          temp.remove(temp.size()-1);
          flag[i]=false;
        }
    }
  }


}