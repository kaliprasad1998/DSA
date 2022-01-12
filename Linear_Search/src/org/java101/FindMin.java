package org.java101;

public class FindMin {

  public static void main(String[] args) {
    int[] nums = {2, 5, 17, -5, 33, 68, 94};
    int out = findMin(nums);
    System.out.println(out);
  }

  static int findMin(int[] arr) {

    if (arr.length == 0) {
      return Integer.MIN_VALUE;
    }

    int min = arr[0];
    for (int i : arr) {
      if (i < min) {
        min = i;
      }
    }
    return min;
  }

  // Similarly, we can findMin using for loop instead of foreach
  // Similarly, we can find Max
  // We can find min or max within range
}
