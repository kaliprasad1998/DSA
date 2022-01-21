package org.java101;

// Approach 2 to solve the PeakElementLeet problem
// Also,https://leetcode.com/problems/find-peak-element/submissions/
public class PeakElementZigzagLeet {
    public static void main(String[] args) {

    }

    public static int peakIndexInZigzagArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
