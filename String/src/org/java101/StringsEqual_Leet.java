package org.java101;

// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
class StringsEquall {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        boolean out = arrayStringsAreEqual(word1,word2);
        System.out.println(out);
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        for (String s : word1) {
            sb.append(s);
        }
        String s1 = sb.toString();
        sb.setLength(0);
        for (String s : word2) {
            sb.append(s);
        }
        return s1.equals(sb.toString());
    }
}