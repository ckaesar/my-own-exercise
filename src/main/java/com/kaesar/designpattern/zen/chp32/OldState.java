package com.kaesar.designpattern.zen.chp32;

/**
 * 老年人状态
 *
 * @Author: chengk
 * @Date: 2021/5/29 11:18 上午
 */
public class OldState extends HumanState {
    // 老年人的工作就是享受天伦之乐
    @Override
    public void work() {
        System.out.println("// 老年人的工作就是享受天伦之乐!");
    }
}
