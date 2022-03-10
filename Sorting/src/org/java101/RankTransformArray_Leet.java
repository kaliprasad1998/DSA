package org.java101;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

// https://leetcode.com/problems/rank-transform-of-an-array/
class RankTransformArray_Leet {

    public static void main(String[] args) {
        int[] arr = {40,10,20,30,10};
        int[] out = arrayRankTransform2(arr);
        System.out.println(Arrays.toString(out));
    }

    // logic is correct but failed in time in leet code
    public static int[] arrayRankTransform(int[] arr) {
//        int[] temp = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            temp[i] = arr[i];
//        }
        int[] temp = arr.clone();
        Arrays.sort(temp);
        Stack<Integer> s = new Stack<>();
        for (int i : temp) {
            if(s.size() == 0 || s.peek() != i) {
                s.push(i);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.indexOf(arr[i]) + 1;
        }
        return arr;
    }

    // Solution I learnt from discussions
    public static int[] arrayRankTransform2(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : temp){
           map.putIfAbsent(i,map.size() + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }


}