package org.java101;

// https://leetcode.com/problems/to-lower-case/
class LowerCase_Leet {
    public static void main(String[] args) {
        String input = "HAZaello";
        String out = toLowerCase(input);
        System.out.println(out);
    }

    public static String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int num = (int) chars[i];
            if (num >= 65 && num <= 90) {
                chars[i] = (char) (97 + num - 65);
            }
        }
        return new String(chars);
        // return s.toLowerCase();
    }
}