package org.java101;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

// https://leetcode.com/problems/majority-element/
class MajorityElement_Leet {

    public static void main(String[] args) {
        int[] arr = {4,4,4,5,5,3};
        int out = majorityElement1(arr);
        System.out.println(out);
    }
    // Sorting
    public static int majorityElement1(int[] nums) {
        // Arrays.sort(nums);
        // SelectionSort
        for (int i = 0; i < nums.length; i++) {
            int maxIndex = findMax(nums, nums.length - 1 - i);
            if(nums[nums.length - 1 -i] != nums[maxIndex]) {
                swap(nums,maxIndex,nums.length - 1 -i);
            }
        }

        return nums[nums.length/2];
    }

    public static void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
    public static int findMax(int[] arr, int lastIndex){
        int ret = 0;
        for (int i = 1; i <= lastIndex ; i++) {
            if(arr[i] > arr[ret]){
                ret = i;
            }
        }
        return ret;
    }

    // Moore voting algorithm
    // Didn't understand this shit 😒😂
    public static int majorityElement3(int[] nums) {
        int count=0, ret = 0;
        for (int num: nums) {
            if (count==0)
                ret = num;
            if (num!=ret)
                count--;
            else
                count++;
        }
        return ret;
    }

    public static int majorityElement(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer n : set) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == n) {
                    count++;
                }
            }
            map.put(n, count);
        }

        int max = 0;
        int out = 0;
        for (Map.Entry entry : map.entrySet()) {
            if ((Integer) entry.getValue() > max) {
                max = (Integer) entry.getValue();
                out = (Integer) entry.getKey();
            }
        }
        return out;
    }
}