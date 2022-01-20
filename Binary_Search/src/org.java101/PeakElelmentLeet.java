package org.java101;

import java.util.Arrays;

// https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakElelmentLeet {
    public static void main(String[] args) {
//        int[] nums = {0,2,3,5,10,11,5,2,3};
        int[] nums = {3, 5, 3, 2, 0};
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));

        int out = peakIndexInMountainArray(nums);
        System.out.println(out);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid] < arr[mid - 1]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
