package org.java101;

import java.util.Arrays;

// https://leetcode.com/problems/assign-cookies/
class AssignCookies_Leet {

    public static void main(String[] args) {
        int[] arr1 = {2,2};
        int[] arr2 = {1,1,2,3};
        int out = findContentChildren(arr1,arr2);
        System.out.println(out);
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int innerStart = 0;
        int count = 0;
        for (int i = 0; i < g.length; i++) {
            for (int j = innerStart; j < s.length ; j++) {
                if(g[i] <= s[j]){
                    innerStart = j + 1;
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}