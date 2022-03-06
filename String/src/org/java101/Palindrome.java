package org.java101;

public class Palindrome {
    public static void main(String[] args) {
        String name = "abac";
        System.out.println(isPalindromeSB(name));
    }

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    public static boolean isPalindromeFor(String s) {
        if (s == null || s.length() == 0) {
            // ask interviewer if it should return true or false
            return true;
        }
        for (int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeSB(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);

        if (s.equals(stringBuilder.reverse().toString())) {
            return true;
        }
        return false;
    }
}
