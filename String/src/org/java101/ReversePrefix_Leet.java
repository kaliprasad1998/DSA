package org.java101;

// https://leetcode.com/problems/reverse-prefix-of-word/
class ReversePrefix_Leet {
    public static void main(String[] args) {
        String out = reversePrefix("abcdef", 'd');
        System.out.println(out);
    }

    public static String reversePrefix(String word, char ch) {
        if (!word.contains(String.valueOf(ch))) {
            return word;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            sb.insert(0, word.charAt(i));
            if (word.charAt(i) == ch) {
                sb.append(word.substring(i + 1));
                break;
            }
        }
        return sb.toString();
    }
}