package org.java101;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;


class MajorityElement_Leet {

    public static void main(String[] args) {
        int[] arr = {3,3,4};
        int out = majorityElement(arr);
        System.out.println(out);
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