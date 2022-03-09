package org.java101;

import java.util.Arrays;

// https://leetcode.com/problems/array-partition-i/
class ArrayPartition_Leet {

  public static void main(String[] args) {
      int[] arr = {6,2,6,5,1,2};
      int out = arrayPairSum(arr);
      System.out.println(out);
  }

  public static int arrayPairSum(int[] nums) {
    Arrays.sort(nums);
    int sum = 0;
    for (int i = 0; i < nums.length; i = i + 2) {
      sum += nums[i];
    }
    return sum;
  }
}