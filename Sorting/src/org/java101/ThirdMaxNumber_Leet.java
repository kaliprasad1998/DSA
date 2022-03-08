package org.java101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/third-maximum-number/
class ThirdMaxNumber_Leet {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 1};
        int out = thirdMax2(arr);
        System.out.println(out);
    }

    public static int thirdMax(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }
        Collections.sort(list);
        if (list.size() >= 3) {
            return list.get(list.size() - 3);
        }
        return list.get(list.size() - 1);
    }

    // Faster solution
    public static int thirdMax2(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                list.add(nums[i]);
            }
        }
        int out = 0;
        if (list.size() >= 3) {
            out = (Integer) list.get(list.size() - 3);
            return out;
        }
        out = (Integer) list.get(list.size() - 1);
        return out;
    }
}