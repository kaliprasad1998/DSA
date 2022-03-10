package org.java101;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// https://leetcode.com/problems/relative-sort-array/
class RelativeSortArray_Leet {

  public static void main(String[] args) {
    int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
    int[] arr2 = {2, 1, 4, 3, 9, 6};
    relativeSortArray(arr1, arr2);
  }

  public static int[] relativeSortArray(int[] arr1, int[] arr2) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr2.length; i++) {
      int count = 0;
      for (int j = 0; j < arr1.length; j++) {
        if (arr1[j] == arr2[i]) {
          count++;
        }
      }
      map.put(arr2[i], count);
    }
    int[] out = new int[arr1.length];

    int index = 0;
    for (int i = 0; i < arr2.length; i++) {
      for (int j = 0; j < map.get(arr2[i]); j++) {
        out[index] = arr2[i];
        index++;
      }
    }
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    List<Integer> list3 = new ArrayList<>();
    for (int i : arr1) {
      list1.add(i);
    }
    for (int i : arr2) {
      list2.add(i);
    }
    for (Integer i : list1) {
      if (!list2.contains(i)) {
        list3.add(i);
      }
    }
    Collections.sort(list3);
    index = out.length - 1;
      for (int i = list3.size() - 1; i >= 0 ; i--) {
          out[index] = list3.get(i);
          index--;
      }
      return out;
  }
}
