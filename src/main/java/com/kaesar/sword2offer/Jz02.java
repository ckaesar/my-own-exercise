package com.kaesar.sword2offer;

/**
 * 标题：替换空格
 * 题目描述
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Jz02 {

    public static void main(String[] args) {
        StringBuffer strTest = new StringBuffer("We Are Happy");
        System.out.println(replaceSpace(strTest));
    }

    /**
     * 遍历每一个字符，替换空格
     * @param str
     * @return
     */
    public static String replaceSpace(StringBuffer str) {
        StringBuffer str1 = new StringBuffer("");
        for(int i = 0; i < str.length(); i++){
            if(' ' == str.charAt(i)){
                str1.append("%20");
            }else{
                str1.append(str.charAt(i));
            }
        }
        return str1.toString();
    }
}
