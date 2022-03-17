package org.java101;

// https://leetcode.com/problems/sorting-the-sentence/
class SortSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String out = sortSentence(s);
        System.out.println(out);
    }

    public static String sortSentence(String s) {
        String[] strings = s.split("\\s+");
        String[] arr = new String[strings.length];
        for (int i = 0; i < strings.length; i++) {
            String word = strings[i];
            int index = Integer.valueOf(word.substring(word.length() - 1));
            arr[index - 1] = word.substring(0, word.length() - 1);
        }
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str);
            sb.append(" ");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }

}