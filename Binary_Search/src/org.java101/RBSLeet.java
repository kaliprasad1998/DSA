package org.java101;

// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RBSLeet {
    public static void main(String[] args) {
        int[] nums = {7,8,1,2,3,4,5,6};
        int out = search(nums,2);
        System.out.println(out);

    }

    public static int search(int[] nums, int target) {

        int pivot = findPivot(nums);
        if (pivot == -1) {
            return BS(nums, target, 0, nums.length - 1);
        }

        if(target == nums[pivot]){
            return pivot;
        }

        if (target < nums[0]) {
            return BS(nums, target, pivot + 1, nums.length - 1);
        }
        return BS(nums, target, 0, pivot);
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else if (arr[mid] > arr[start]) {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int BS(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
