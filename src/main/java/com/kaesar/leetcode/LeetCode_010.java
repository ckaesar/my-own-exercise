package com.kaesar.leetcode;

public class LeetCode_010 {
    public static boolean isMatch(String s, String p) {
        if ((s == null || s.length() == 0) && (p == null || p.length() == 0)) {
            return true;
        }
        if ((p == null || p.length() == 0) && s.length() > 0) {
            return false;
        }

        char preChar = 0;
        boolean havePreChar = false;
        int sIndex = 0;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '.') {
                if (i < p.length() - 1 && p.charAt(i + 1) == '*') {
                    preChar = p.charAt(i);
                    havePreChar = true;
                    continue;
                } else {
                    if (sIndex < s.length()) {
                        preChar = s.charAt(sIndex);
                        sIndex++;
                        havePreChar = true;
                        continue;
                    } else {
                        return false;
                    }
                }
            }
            if (p.charAt(i) == '*') {
                if (!havePreChar) {
                    return false;
                }
                if (sIndex == s.length()) {
                    if (p.length() - 1 == i) {
                        return true;
                    } else {
                        return isMatch("", p.substring(i + 1));
                    }
                } else {
                    if (preChar == '.') {
                        if (i == p.length() - 1) {
                            return true;
                        }
                        while (sIndex < s.length()) {
                            boolean result = isMatch(s.substring(sIndex), p.substring(i + 1));
                            if (result) {
                                return true;
                            }
                            sIndex++;
                            continue;
                        }
                    } else {
                        while (sIndex < s.length()) {
                            if (s.charAt(sIndex) == preChar) {
                                boolean result = isMatch(s.substring(sIndex), p.substring(i + 1));
                                if (result) {
                                    return true;
                                }
                                sIndex++;
                                continue;
                            } else {
                                break;
                            }

                        }
                    }
                    havePreChar = false;
                }
            }
            if (p.charAt(i) != '*' && p.charAt(i) != '.') {
                if (i < p.length() - 1 && p.charAt(i + 1) == '*') {
                    preChar = p.charAt(i);
                    havePreChar = true;
                    continue;
                } else {
                    if (sIndex == s.length() || s.charAt(sIndex) != p.charAt(i)) {
                        return false;
                    } else {
                        sIndex++;
                        havePreChar = false;
                        continue;
                    }
                }
            }
        }

        if (sIndex < s.length()) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "", p = "c*c*"; // true
        System.out.println(isMatch(s, p));
    }
}