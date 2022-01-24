package org.java101;

// https://leetcode.com/problems/find-in-mountain-array/
public class SearchInMountainLeet {
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 4, 7, 8, 10, 15, 18};
        int[] nums2 = {21, 18, 15, 14, 11, 8, 5, 2};
        int[] nums3 = {2, 3, 4, 5, 8, 5, 1};

        int out1 = OrderAgnosticBS(nums1, 8, 1, 5);
        int out2 = OrderAgnosticBS(nums2, 5, 2, 7);
        int out3 = findPeakinMountain(nums3);
        System.out.println(out1);
        System.out.println(out2);
        System.out.println(out3);
    }

    public int findInMountainArray(int target, int[] mountainArr) {
        int peak = findPeakinMountain(mountainArr);
        int firstTry = OrderAgnosticBS(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        int secondTry = OrderAgnosticBS(mountainArr, target, peak + 1, mountainArr.length - 1);
        return secondTry;
    }

    static int findPeakinMountain(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int OrderAgnosticBS(int[] arr, int target, int start, int end) {

        if (arr.length == 0) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[start] < arr[end]) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
