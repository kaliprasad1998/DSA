package org.java101;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-product-of-three-numbers/
class MaxProductof3Numbers_Leet {

    public static void main(String[] args) {
        int[] nums = {-100,-98,-1,2,3,4};
        int[] nums2 = {-1,-2,-3,-4};
        int[] nums3 = {0,0,0};
        int out = maximumProduct(nums3);
        System.out.println(out);
    }
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        boolean negatives = false;
        boolean positives = false;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < 0) {
                negatives = true;
            } else {
                positives = true;
            }

            if(negatives && positives) {
                break;
            }
        }

        int l = nums.length;
        if(negatives && positives){
            if(nums[0] * nums[1] > nums[l - 2]*nums[l-3]) {
                return nums[0] * nums[1] * nums[l - 1];
            }
        }

        return nums[l - 1]*nums[l - 2]*nums[l-3] ;
    }

    // found this one in discussions which makes more sense
    // In a sorted array, the maximum product will be either the last three largest elements or the first two (negative elements) multiplied by the last (largest) element
    public int maximumProduct2(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;

        return Math.max(nums[0]*nums[1]*nums[len-1], nums[len-1] * nums[len-2] * nums[len-3]);
    }
}