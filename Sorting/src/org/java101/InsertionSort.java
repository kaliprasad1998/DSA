package org.java101;

import java.util.Arrays;

public class InsertionSort {

  public static void main(String[] args) {
    int[] nums = {3, 5, 4, 1, 2, 0, -23};
//    int[] nums1 = {};
    insertionSort(nums);
    System.out.println(Arrays.toString(nums));
  }

  static void insertionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j > 0; j--) {
        if (arr[j] < arr[j - 1]) {
          swap(arr, j, j - 1);
        } else {
          break;
        }
      }
    }
  }

  static void swap(int[] arr, int i1, int i2) {
    int temp = arr[i1];
    arr[i1] = arr[i2];
    arr[i2] = temp;
  }

}
