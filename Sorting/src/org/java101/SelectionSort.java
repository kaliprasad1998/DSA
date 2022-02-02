package org.java101;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {3, 4, -5, 0, 1, 2};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxElementIndex = findMax(arr, 0, lastIndex);
            if (lastIndex != maxElementIndex) {
                swap(arr, maxElementIndex, lastIndex);
            }
        }
    }

    public static int findMax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
