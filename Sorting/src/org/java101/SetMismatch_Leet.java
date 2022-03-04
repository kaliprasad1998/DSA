package org.java101;

import java.util.Arrays;

// https://leetcode.com/problems/set-mismatch/
class SetMismatch_Leet {

    public static void main(String[] args) {
//        int[] arr = {1,2,2,4};
        int[] arr = {1,1};
        int[] out = findErrorNums(arr);
        System.out.println(Arrays.toString(out));
    }
    public static int[] findErrorNums(int[] nums) {
        int index = 0;
        while(index < nums.length) {
            int correctIndex = nums[index] - 1;
            if(nums[index] == nums[correctIndex]) {
                index++;
            } else {
                swap(nums, index, correctIndex);
            }
        }
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i + 1) {
                arr[0] = nums[i];
                arr[1] = i + 1;
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

}