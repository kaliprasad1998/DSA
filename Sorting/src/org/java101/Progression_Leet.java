package org.java101;

import java.util.Arrays;

// https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
class Progression_Leet {

    public static void main(String[] args) {
        int[] nums = {1,2,4};
        System.out.println(canMakeArithmeticProgression(nums));
    }
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if(diff != arr[i] - arr[i - 1]){
                return false;
            }
        }
        return true;
    }
}