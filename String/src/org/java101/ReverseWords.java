package org.java101;

// https://leetcode.com/problems/reverse-words-in-a-string-iii/
class ReverseWords {
    public static void main(String[] args) {
        String  s = "Let's take LeetCode contest";
        String output = reverseWords(s);
        System.out.println(output);
    }
    public static String reverseWords(String s) {
       String[] strings = s.split("\\s+");
       StringBuilder sb = new StringBuilder();
       StringBuilder out = new StringBuilder();
       for (String str : strings) {
           sb.append(str);
           sb.reverse();
           out.append(sb.toString() + " ");
           sb.setLength(0);
       }
       String ret = out.toString();
       return ret.substring(0,ret.length() - 1);
    }
}