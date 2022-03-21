package org.java101;

// https://leetcode.com/problems/longest-common-prefix/
class CommonPrefix_Leet {
    public static void main(String[] args) {

        String[] strs = {"cir", "ca", "car"};
        String out = longestCommonPrefix(strs);
        System.out.println(out);

    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int minLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }

        for (int i = 0; i < minLength; i++) {
            boolean presentInAllStrings = true;
            for (int j = 0; j < strs.length - 1; j++) {
                if (strs[j].charAt(i) != strs[j + 1].charAt(i)) {
                    presentInAllStrings = false;
                    break;
                }
            }
            if (presentInAllStrings) {
                sb.append(strs[0].charAt(i));
            } else {
                break;
            }
        }

        return sb.toString();
    }
}