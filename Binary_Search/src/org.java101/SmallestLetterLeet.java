package org.java101;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetterLeet {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char out = nextGreatestLetter(letters,'a');
        System.out.println(out);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < letters[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
