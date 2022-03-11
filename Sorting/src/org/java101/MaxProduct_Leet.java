package org.java101;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
class MaxProduct_Leet {

    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        int out = maxProduct(nums);
        System.out.println(out);
    }
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}