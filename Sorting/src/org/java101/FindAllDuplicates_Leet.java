package org.java101;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/
class FindAllDuplicates_Leet {
    public List<Integer> findDuplicates(int[] nums) {
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
        out.add(nums[j]);
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