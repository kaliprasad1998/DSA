package org.java101;

public class Ceiling {
    public static void main(String[] args) {
        int[] nums = {2, 8, 16, 28, 44, 57, 59, 74, 83};
        int out = ceiling(nums,30);
        int out2 = ceiling(nums, 90);
        System.out.println(out);
        System.out.println(out2);
    }

    // smallest number greater than or equal to target in the array
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if(arr[arr.length - 1] < target){
            return -1;
        }

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
        return start;
    }
}
