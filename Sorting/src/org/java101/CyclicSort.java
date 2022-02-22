package org.java101;

import java.util.Arrays;

public class CyclicSort {

  public static void main(String[] args) {
    int[] arr = {5, 3, 4, 6, 2, 1,};
    cyclicSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static void cyclicSort(int[] arr) {
    int i = 0;

    while (i < arr.length) {
      int correctIndex = arr[i] - 1;
      if (arr[i] == arr[correctIndex]) {
        i++;
      } else {
        swap(arr, i, correctIndex);
      }
    }
  }

  static void swap(int[] arr, int i1, int i2) {
    int temp = arr[i1];
    arr[i1] = arr[i2];
    arr[i2] = temp;
  }

}
