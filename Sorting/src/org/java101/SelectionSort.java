package org.java101;

import java.util.Arrays;

public class SelectionSort {

  public static void main(String[] args) {
    int[] nums = {3,5,4,1,2,0,-53};
    selectionSort(nums);
    System.out.println(Arrays.toString(nums));
  }

  static void selectionSort(int[] arr){
    for (int i = arr.length - 1; i > 0 ; i--) {
      int maxIndex = findMax(arr,i);
      swap(arr,maxIndex,i);
    }
  }

  static int findMax(int[] arr, int end){
    int max = 0;
    for (int i = 1; i <= end ; i++) {
      if(arr[i] > arr[max]){
        max = i;
      }
    }
    return max;
  }

  static void swap(int[] arr, int i1, int i2){
    int temp = arr[i1];
    arr[i1] = arr[i2];
    arr[i2] = temp;
  }

}
