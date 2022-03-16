package org.java101;

// https://leetcode.com/problems/shuffle-string/
class ShuffleString_Leet {

    public static void main(String[] args) {
       int[] indices = {4,5,6,7,0,2,1,3};
       String s = "codeleet";
       String out = restoreString(s,indices);
        System.out.println(out);
    }

    public static String restoreString(String s, int[] indices) {
        char[] chars = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            int index = indices[i];
            chars[index] = s.charAt(i);
        }
        return String.copyValueOf(chars);
    }
}