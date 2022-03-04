package org.java101;

// https://leetcode.com/problems/find-the-duplicate-number/
class FindDuplicateNumber_Leet {

    public static void main(String[] args) {
      int[] nums = {3,1,3,4,2};
      int out = findDuplicate(nums);
        System.out.println(out);
    }
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correctIndex = nums[i] - 1;
            if(nums[i] == nums[correctIndex]) {
                i++;
            }else {
                swap(nums, i, correctIndex);
            }
        }

        for (int j = 1; j < nums.length + 1 ; j++) {
            if(nums[j - 1] != j) {
                return nums[j - 1];
            }
        }
        return -1;
    }

    public static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}