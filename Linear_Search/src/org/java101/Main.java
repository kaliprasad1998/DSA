package org.java101;

public class Main {

  public static void main(String[] args) {
    int[] nums = {2, 5, 17, 54, 33, 68, 94};

    int out1 = linearSearch1(nums, 33);
    int out2 = linearSearch2(nums, 33);
    boolean out3 = linearSearch3(nums, 33);
    System.out.println(out1);
    System.out.println(out2);
    System.out.println(out3);
  }

  static int linearSearch1(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;
  }

  static int linearSearch2(int[] arr, int target) {
    if (arr.length == 0) {
      return Integer.MAX_VALUE;
    }
    for (int element : arr) {
      if (element == target) {
        return element;
      }
    }

    return Integer.MAX_VALUE;
  }

  static boolean linearSearch3(int[] arr, int target) {
    if (arr.length == 0) {
      return false;
    }
    for (int element : arr) {
      if (element == target) {
        return true;
      }
    }

    return false;
  }
}
