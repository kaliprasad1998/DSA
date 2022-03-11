package org.java101;

import java.util.Arrays;
import java.util.HashMap;

// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
class NumsSmallerCurrent_Leet {

  public static void main(String[] args) {
    int[] arr = {8, 1, 2, 2, 3};
      int[] arr2 = {6,5,4,8};
    int[] out = smallerNumbersThanCurrent(arr2);
    System.out.println(Arrays.toString(out));
  }

  public static int[] smallerNumbersThanCurrent(int[] nums) {
    int[] temp = nums.clone();
    Arrays.sort(temp);
    HashMap<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < temp.length; i++) {
          map.putIfAbsent(temp[i],i );
      }
    for (int i = 0; i < nums.length; i++) {
      nums[i] = map.get(nums[i]);
    }
    return nums;
  }
}