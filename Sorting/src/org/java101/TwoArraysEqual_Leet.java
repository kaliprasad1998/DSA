package org.java101;

import java.util.Arrays;

// https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/
class TwoArraysEqual_Leet {

  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 4};
    int[] arr2 = {2, 4, 1, 3};
    System.out.println(canBeEqual(arr1, arr2));
  }

  public static boolean canBeEqual(int[] target, int[] arr) {
    if (arr.length != target.length) {
      return false;
    }
    Arrays.sort(target);
    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != target[i]) {
        return false;
      }
    }
    return true;
  }
}