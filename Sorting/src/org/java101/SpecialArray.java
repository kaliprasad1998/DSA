package org.java101;

import java.util.Arrays;

// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
public class SpecialArray {

  public static void main(String[] args) {

  }
  public int specialArray(int[] nums) {
    Arrays.sort(nums);
    for (int i = nums.length; i <= 1 ; i--) {
      if(nums[nums.length - 1] < i) {

      }
    }
    return -1;
  }

  public static int maxIndex(int[] arr, int end){
    int max = 0;
    for (int i = 1; i <= end; i++) {
      if(arr[i] > arr[max]) {
        max = i;
      }
    }
    return max;
  }
}
