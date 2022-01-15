package org.java101;

import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

// Brute force approach is linear search from start to end to find the first occurence
// and then linear search from last index to first to find the last occurrence.
// time complexity would be O(n)
// Optimal solution is to use binary search so that time complexity is O(logn)
public class firstLastLeet {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 10};
        int[] out = searchRange(arr, 8);
        System.out.println(Arrays.toString(out));
    }

    static int[] searchRange(int[] nums, int target){
        int[] out = {search(nums,target,true), search(nums,target,false)};
        return out;
    }

    static int search(int[] nums, int target, boolean findStartingIndex) {

        int i = -1;

        if (nums.length == 0) {
            return i;
        }

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                if (findStartingIndex) {
                    i = mid;
                    end = mid - 1;
                } else {
                    i = mid;
                    start = mid + 1;
                }
            }
        }

        return i;
    }
}
