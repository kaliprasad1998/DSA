package org.java101;

// https://leetcode.com/problems/missing-number/
public class MissingNumberLeet {

  public static void main(String[] args) {
    int[] arr = {3, 0, 1,2,4};
    int out = missingNumber(arr);
    System.out.println(out);
  }

  public static int missingNumber(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      int correctIndex = nums[i];
      if (correctIndex < nums.length && nums[i] != nums[correctIndex]) {
        swap(nums, i, correctIndex);
      } else {
        i++;
      }
    }

    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != j) {
        return j;
      }
    }
    return nums.length;
  }

  static void swap(int[] nums, int i1, int i2) {
    int temp = nums[i1];
    nums[i1] = nums[i2];
    nums[i2] = temp;
  }
}
