package org.java101;
import java.util.Arrays;

// https://leetcode.com/problems/sort-array-by-parity-ii/
class SortArrayParityII_Leet {
    public static void main(String[] args) {
        int[] arr = {4,2,5,7};
        int[] arr2 = {1, 0};
        System.out.println(Arrays.toString(sortArrayByParityII(arr)));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        if (nums.length < 2) {
            return nums;
        }
        while (start <= end) {
            if (nums[start] == 0 || nums[start] % 2 == 0) {
                start++;
                if (nums[end] % 2 != 0) {
                    end--;
                }
            } else if (nums[start] != 0 && nums[start] % 2 != 0) {
                if (nums[end] == 0 || nums[end] % 2 == 0) {
                    swap(nums, start, end);
                }
                end--;
            }
        }

        for (int i = 1; i < nums.length/2; i = i + 2) {
            swap(nums, i, nums.length - i - 1);
        }
        return nums;
    }

    public static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}