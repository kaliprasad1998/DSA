package org.java101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/intersection-of-two-arrays-ii/
class Intersection2_Leet {
    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {1,1};

        int[] out = intersect(arr1,arr2);
        System.out.println(Arrays.toString(out));
    }

    //TODO: Very basic approach check the discussions and learn alternatives
    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for(int num : nums1) {
            list1.add(num);
        }
        for(int num : nums2) {
            list2.add(num);
        }

        int length = list1.size() < list2.size() ? list1.size() : list2.size();
        List<Integer> out = new ArrayList<>();
        List<Integer> smallList = list1.size() <= list2.size() ? list1 : list2;
        List<Integer> bigList = list1.size() > list2.size() ? list1 : list2;
        for (int i = 0; i < length; i++) {
            Integer k = smallList.get(i);
            if(bigList.contains(k)){
                bigList.remove(k);
                out.add(k);
            }
        }
        int[] ret = new int[out.size()];
        for (int i = 0; i < out.size(); i++) {
            ret[i] = out.get(i);
        }
        return ret;
    }
}