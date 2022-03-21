package org.java101;

import java.util.Locale;

// https://leetcode.com/problems/valid-palindrome/
class ValidPalindrome_Leet {
    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
    public static boolean isPalindrome(String s) {
        String newString = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < newString.length(); i++) {
            int num = (int)newString.charAt(i);
            if( num >= 97 && num <= 122 || num >= 48 && num <= 57) {
                sb.append(newString.charAt(i));
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }
}