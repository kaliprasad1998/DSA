package org.java101;

public class SearchInRange {

  public static void main(String[] args) {
    int[] nums = {2, 5, 17, 54, 33, 68, 94};
    int out = linearSearch1(nums, 17, 1, 4);
    System.out.println(out);
  }

  static int linearSearch1(int[] arr, int target, int start, int end) {
    if (arr.length == 0) {
      return -1;
    }
    for (int i = start; i <= end; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;
  }
}
