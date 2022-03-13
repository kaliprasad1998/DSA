package org.java101;

import java.util.Arrays;

// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
public class SpecialArray_Leet {

  public static void main(String[] args) {
    int[] nums = {0,4,3,0,4};
    int[] nums1 = {3,5};
    System.out.println(specialArray(nums1));
  }
  public static int specialArray(int[] nums) {
    Arrays.sort(nums);
    for (int i = nums.length; i >0  ; i--) {
        int count = findNumsGreaterThan(nums,i);
        if(count == i) {
          return i;
        }
    }
    return -1;
  }
  
  public static int findNumsGreaterThan(int[] arr, int k) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] >= k){
        count++;
      }
    }
    return count;
  }

}
