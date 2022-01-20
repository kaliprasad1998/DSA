package org.java101;

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
// Infinite array is an assumption, and it means we cannot use array.length
public class InfiniteArray {
    public static void main(String[] args) {
        int[] nums = {2, 8, 16, 28, 44, 57, 59, 74, 83, 86, 90,92,96,99,110};
        int out = findElement(nums,15);
        System.out.println(out);
    }

    static int findElement(int[] nums, int target){

        int start = 0;
        int end = 1;

        // Finding the range where our target might be there (target may or may not exist in array)
        int out = binarySearch(nums,target,start,end);
        while(target > nums[end]){
            int temp = end;
            end = end + 2*(end - start + 1);
            start = temp + 1;
        }
        return binarySearch(nums,target,start,end);
    }

    static int binarySearch(int[] arr, int target, int s, int e) {
        int start = s;
        int end = e;

        // Assumed array is sorted in ascending order
        while (start <= end) {
            // int mid = (start + end)/2
            // if start and end are very big then start + end may result a no greater than range of int

            int mid = start + (end - start) / 2;
            // Always start with scenario where target < mid
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
