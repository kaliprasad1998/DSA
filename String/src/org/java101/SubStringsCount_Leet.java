package org.java101;

import java.util.ArrayList;
import java.util.List;

class SubStringsCount_Leet {

    public static void main(String[] args) {
        String[] patterns = {"a", "abc", "bc", "d"};
        int out = numOfStrings(patterns,"abc");
        String s = "abcdef";
        System.out.println(s.contains("ab"));
        System.out.println(out);
    }

    // Easy approach
    public int numOfStrings2(String[] patterns, String word) {
        int count = 0;
        for(int i=0;i<patterns.length;i++){
            if(word.contains(patterns[i])){
                count++;
            }
        }
        return count;
    }

    // Dumb approach
    public static int numOfStrings(String[] patterns, String word) {
        List<String> subStrings = new ArrayList<>();
        int[] nums = new int[word.length()];
        int count = 0;
        for(String pattern : patterns) {
            if(pattern.length() <= word.length() && nums[pattern.length() - 1] == 0) {
                updateSubStringsList(subStrings,word,pattern.length());
                nums[pattern.length() - 1] = 1;
            }
            if(subStrings.contains(pattern)) {
                count++;
            }
        }
        return count;
    }

    static void updateSubStringsList(List<String> list, String s, int ssLength) {
        for (int i = 0; i < s.length() - ssLength + 1 ; i++) {
            list.add(s.substring(i,i + ssLength));
        }
    }

}