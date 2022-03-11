package org.java101;

import java.util.Arrays;

// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
class AverageSalary_Leet {

    public static void main(String[] args) {
        int[] nums = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        double out = average(nums);
        System.out.println(out);
    }

    public static double average(int[] salary) {
        Arrays.sort(salary);
        int sum = 0;
        for (int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
        }
        double ret = (double) sum/ (salary.length - 2);
        return ret;
    }
}