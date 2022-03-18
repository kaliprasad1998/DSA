package org.java101;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 8, 10, 21};
        int out = binarySearch(arr, 0, arr.length - 1, 10);
        System.out.println(out);
    }

    public static int binarySearch(int[] arr, int start, int end, int target) {
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                end = mid - 1;
                return binarySearch(arr, start, end, target);
            } else if (target > arr[mid]) {
                start = mid + 1;
                return binarySearch(arr, start, end, target);
            }
        }
        return -1;
    }
}
