package org.java101;

// https://leetcode.com/problems/first-missing-positive/
class FirstMissingPositive_Leet {

    public static void main(String[] args) {
//        int[] nums = {3,4,-1,1};
        int[] nums = {7,10,9,12,11};
        int out = firstMissingPositive(nums);
        System.out.println(out);
    }
    public static int firstMissingPositive(int[] nums) {
        int index = 0;

        while (index < nums.length){
            int correctIndex = nums[index] - 1;
            if(nums[index] <= 0 || correctIndex > nums.length - 1 || nums[index] == nums[correctIndex] ){
                index++;
            } else {
                swap(nums,index,correctIndex);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i + 1 || nums[i] < 0) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }

    public static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}