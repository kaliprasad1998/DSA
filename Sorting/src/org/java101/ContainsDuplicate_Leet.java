package org.java101;

import java.util.Arrays;
import java.util.TreeSet;

// https://leetcode.com/problems/contains-duplicate/
class ContainsDuplicate_Leet {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate1(arr));
    }
    public static boolean containsDuplicate1(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        if(set.size() == nums.length){
            return false;
        }

        return true;
    }

    // Faster as per leet code
    public static boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}