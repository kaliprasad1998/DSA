package org.java101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/minimum-absolute-difference/
class MinAbsDiff_Leet {

    public static void main(String[] args) {
        int[] nums = {3,8,-10,23,19,-4,-14,27};
        List<List<Integer>> out = minimumAbsDifference(nums);
        System.out.println(out);
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length ; i++) {
            int diff = arr[i] - arr[i - 1];
            if(diff < min){
                min = diff;
            }
        }
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = 1; i < arr.length ; i++) {
            if (min == arr[i] - arr[i - 1]) {
                ret.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        return ret;
    }
}