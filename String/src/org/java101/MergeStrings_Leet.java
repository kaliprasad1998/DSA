package org.java101;

// https://leetcode.com/problems/merge-strings-alternately/
class MergeStrings_Leet {
    public static void main(String[] args) {
        String out = mergeAlternately("abcd", "pq");
        System.out.println(out);
    }
    public static String mergeAlternately(String word1, String word2) {
        int minLength = word1.length() < word2.length() ? word1.length() : word2.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if(word1.length() > minLength) {
            sb.append(word1.substring(minLength));
        }
        if(word2.length() > minLength) {
            sb.append(word2.substring(minLength));
        }
        return sb.toString();
    }
}