package org.java101;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2, 8, 16, 28, 44, 57, 59, 74, 83};
        int out = binarySearch(nums, 16);
        System.out.println(out);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Assumed array is sorted in ascending order
        while (start <= end) {
            // int mid = (start + end)/2
            // if start and end are very big then start + end may result a no greater than range of int

            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }
}
