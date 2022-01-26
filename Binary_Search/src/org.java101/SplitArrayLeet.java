package org.java101;

// https://leetcode.com/problems/split-array-largest-sum/
public class SplitArrayLeet {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
        int out = splitArray(arr,2);
        System.out.println(out);
    }

    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int count = 1;

            for (int num : nums) {
                if (sum + num <= mid) {
                    sum += num;
                } else {
                    sum = num;
                    count++;
                }
            }

            if (count <= m) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
