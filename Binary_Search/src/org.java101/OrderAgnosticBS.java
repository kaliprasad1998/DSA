package org.java101;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] nums = {22,21,18,15,10,8,3};
        int[] nums2 = {2, 8, 16, 28, 44, 57, 59, 74, 83};
        int out = orderAgnosticBinarySearch(nums,15);
        int out2 = orderAgnosticBinarySearch(nums2,44);
        System.out.println(out);
        System.out.println(out2);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            // int mid = (start + end)/2
            // if start and end are very big then start + end may result a no greater than range of int

            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
