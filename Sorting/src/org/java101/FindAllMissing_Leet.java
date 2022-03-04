package org.java101;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class FindAllMissing_Leet {

  public static void main(String[] args) {
    int[] nums = {4,3,2,7,8,2,3,1};
//    int[] nums = {3,4,1,2};
    List<Integer> out = findDisappearedNumbers(nums);
    for(Integer i : out){
      System.out.print(i + " ");
    }
  }

  public static List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> out = new ArrayList<>();

    int i = 0;
    while(i < nums.length ) {
      int correctIndex = nums[i] - 1;
      if(nums[i] == nums[correctIndex]){
        i++;
      } else {
        swap(nums, i, correctIndex);
      }
    }

    for (int j = 0; j < nums.length; j++) {
      if(nums[j] != j + 1){
        out.add(j + 1);
      }
    }

    return out;
  }

  public static void swap(int[] arr, int i1, int i2) {
    int temp = arr[i1];
    arr[i1] = arr[i2];
    arr[i2] = temp;
  }

}
