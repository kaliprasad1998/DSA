package org.java101;

import java.util.Arrays;

// https://leetcode.com/problems/height-checker/
class HeightChecker_Leet {

  public static void main(String[] args) {
    int out = heightChecker(new int[]{5, 1, 2, 3, 4});
    System.out.println(out);
  }

  public static int heightChecker(int[] heights) {
    int[] temp = new int[heights.length];
    for (int i = 0; i < heights.length; i++) {
      temp[i] = heights[i];
    }
    Arrays.sort(heights);
    int count = 0;
    for (int i = 0; i < heights.length; i++) {
      if (temp[i] != heights[i]) {
        count++;
      }
    }
    return count;
  }
}