package org.java101;

import java.util.Arrays;

// https://leetcode.com/problems/largest-perimeter-triangle/
class LargerstPerimeter_Leet {

    public static void main(String[] args) {
        int[] nums = {2,1,1};
        int out = largestPerimeter(nums);
        System.out.println(out);
    }
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1 ; i >= 2 ; i--) {
            if(checkTriangle(nums[i], nums[i - 1], nums[i - 2] )) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }
        return 0;
    }

    public static boolean checkTriangle(int a, int b, int c) {
        if(a + b > c && b + c > a && c + a > b) {
            return true;
        }
        return false;
    }
}