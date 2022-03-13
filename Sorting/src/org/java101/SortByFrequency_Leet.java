package org.java101;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

// https://leetcode.com/problems/sort-array-by-increasing-frequency/
class SortByFrequency_Leet {

    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3};
        int[] nums2 = {8,-8,2,-8,-5,-3};
        System.out.println(Arrays.toString(frequencySort(nums2)));
    }

    // working solution but can be improved
    public static int[] frequencySort(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < temp.length; i++) {
            if (map.containsKey(temp[i])) {
                map.put(temp[i], map.get(temp[i]) + 1);
            } else {
                map.put(temp[i], 1);
            }
        }

        LinkedHashMap<Integer,Integer> map2 = map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue())
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        int[] mid = new int[map2.size()];
        int index = 0;
        for (Integer k : map2.keySet()) {
            mid[index] = k;
            index++;
        }

        for (int i = 0; i < mid.length - 1; i++) {
            for (int j = 0; j < mid.length - i - 1; j++) {
                boolean check1 = map.get(mid[j]) > map.get(mid[j + 1]);
                boolean check2 = map.get(mid[j]) == map.get(mid[j + 1]) && mid[j] < mid[j + 1];
                if (check1 || check2) {
                    swap(mid, j, j + 1);
                }
            }
        }

        System.out.println(Arrays.toString(mid));

        int start = 0;
        for (int i = 0; i < mid.length; i++) {
            int end = map.get(mid[i]);
            for (int j = 0; j < end; j++) {
                temp[start] = mid[i];
                start++;
            }
        }
        return temp;
    }

    public static void swap(int[] arr , int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}