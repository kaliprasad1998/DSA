package org.java101;

// https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class RotationCount {

    public static void main(String[] args) {
        int[] nums = {15, 18, 2, 3, 6, 12};
        int[] nums2 = {7, 9, 11, 12, 5};
        int out = countRotations(nums);
        int out2 = countRotations(nums2);
        System.out.println(out);
        System.out.println(out2);
    }

    static int countRotations(int[] arr){
        int pivot = findPivot(arr);

        // If arr is not rotated we get -1 as pivot and and adding +1 to -1 returns 0 rotations
        return pivot + 1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            if(arr[mid] <= arr[start]){
                end = mid - 1;
            } else if(arr[mid] > arr[start]){
                start = mid + 1;
            }

        }
        return -1;
    }
}
