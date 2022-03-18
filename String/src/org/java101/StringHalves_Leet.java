package org.java101;

// https://leetcode.com/problems/determine-if-string-halves-are-alike/
class StringHalves_Leet {
    public static void main(String[] args) {
        boolean out = halvesAreAlike("aooeiu");
        System.out.println(out);
    }
    public static boolean halvesAreAlike(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int c1 = noOfVowels(chars,0,s.length()/2 - 1);
        int c2 = noOfVowels(chars,s.length()/2 ,s.length() - 1);
        return c1 == c2;
    }

    static int noOfVowels(char[] chars, int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') {
                count++;
            }
        }
        return count;
    }
}