package org.java101;

import java.util.Arrays;

// https://leetcode.com/problems/length-of-last-word/
class LastWordLength {
    public static void main(String[] args) {
        String s = "  fly me   to   the moon       ";
        System.out.println(s.length());
        int out = lengthOfLastWord(s);
        System.out.println(out);
    }

    public static int lengthOfLastWord(String s) {
        String s1 = s.trim();
        int count = 0;
        for (int i = s1.length() - 1; i >= 0; i--) {
            if (s1.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }

    public static int lengthOfLastWord2(String s) {
        String[] arr = s.split("\\s+");
        return arr[arr.length - 1].length();
    }
}